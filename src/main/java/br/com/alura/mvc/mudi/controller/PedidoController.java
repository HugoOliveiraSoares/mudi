package br.com.alura.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mudi.dto.PedidoDTO;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("/pedido") // cria a rota pedido
public class PedidoController {

  @Autowired // Solicita ao Springboot uma instancia de PedidoRepository
  private PedidoRepository pedidoRepository;

  @GetMapping("/formulario") // Define a rota da pagina
  public String formulario(PedidoDTO pedidoDTO) {
    return "pedido/formulario"; // Direciona para a pagina formulario

  }

  @PostMapping("/novo") // Rota que ira receber os dados do formulario
  public String novo(@Valid PedidoDTO pedidoDTO, BindingResult result) {
    // @Valid -> Diz para o framework validar a requisição de acordo com as
    // anotações da classe

    if (result.hasErrors()) { // Se houver errros na validação volta o usuario para o formulario
      return "pedido/formulario";
    }

    Pedido pedido = pedidoDTO.toPedido(); // Transforma a requisição no objeto Pedido

    pedidoRepository.save(pedido); // Salva no banco de dados o pedido

    return "pedido/formulario";

  }

}
