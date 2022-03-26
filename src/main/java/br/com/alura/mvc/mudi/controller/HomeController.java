package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

  @GetMapping("/home")
  public String home(Model model) {

    Pedido pedido = new Pedido();

    pedido.setNomeProduto("Xiaomi Redmi note 8");
    pedido.setUrlProduto(
        "https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW/ref=sr_1_1?keywords=redmi+note+8&qid=1648259281&sr=8-1&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
    pedido.setUrlImagem("https://m.media-amazon.com/images/I/51wgmCYDFML._AC_SL1000_.jpg");
    pedido.setDescricao("uma descrição qualquer para esse pedido");

    List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido); // Cria uma lista com o pedido

    model.addAttribute("pedidos", pedidos); // Envia informações para a view (frontend)

    return "home";

  }

}
