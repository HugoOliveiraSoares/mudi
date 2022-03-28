package br.com.alura.mvc.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mudi.dto.PedidoDTO;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

  @Autowired
  private PedidoRepository pedidoRepository;

  @GetMapping("/formulario") // Direciona para a pagina formulario
  public String formulario() {
    return "pedido/formulario";

  }

  @PostMapping("/novo") // Ira receber os dados do formulario
  public String novo(PedidoDTO pedidoDTO) {

    Pedido pedido = pedidoDTO.toPedido(); // Transforma a requisição no objeto Pedido

    pedidoRepository.save(pedido); // Salva no banco de dados o pedido

    return "pedido/formulario";

  }

}
