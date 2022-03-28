package br.com.alura.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mudi.model.Pedido;

public class PedidoDTO {

  // Os nomes das variaveis devem ter o mesmo nome do input do formulario html
  @NotBlank // Valida se o campo não é nulo e nem vazio, ou seja, so um espaço em branco
  private String nomeProduto;
  @NotBlank
  private String urlImagem;
  @NotBlank
  private String urlProduto;
  private String descricao;

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public String getUrlImagem() {
    return urlImagem;
  }

  public void setUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  }

  public String getUrlProduto() {
    return urlProduto;
  }

  public void setUrlProduto(String urlProduto) {
    this.urlProduto = urlProduto;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Pedido toPedido() {
    return new Pedido(this.nomeProduto, this.urlImagem, this.urlProduto,
        this.descricao);
  }

}
