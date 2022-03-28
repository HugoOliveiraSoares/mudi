package br.com.alura.mvc.mudi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {

  @Autowired // Solicita ao Springboot uma instancia de PedidoRepository
  private PedidoRepository pedidoRepository;

  @GetMapping("/home") // Define a rota da pagina
  public String home(Model model) {

    List<Pedido> pedidos = pedidoRepository.findAll(); // Busca todos os pedidos

    model.addAttribute("pedidos", pedidos); // Envia informações para a view (frontend)

    return "home"; // Direciona para a pagina home.html

  }

}
