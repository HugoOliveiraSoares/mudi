package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Indica que a classe representa uma tabela no banco de dados
public class Pedido {

  @Id // Indica que a variavel é um id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que ira gerar o Id automaticamente
  private Long id;

  private String nomeProduto;
  private BigDecimal valorNegociado;
  private LocalDate dataDaEntrega;
  private String urlImagem;
  private String urlProduto;
  private String descricao;

  public Pedido() {
  }

  public Pedido(String nomeProduto, String urlImagem,
      String urlProduto, String descricao) {

    this.nomeProduto = nomeProduto;
    this.urlImagem = urlImagem;
    this.urlProduto = urlProduto;
    this.descricao = descricao;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUrlImagem() {
    return urlImagem;
  }

  public void setUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  }

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public BigDecimal getValorNegociado() {
    return valorNegociado;
  }

  public void setValorNegociado(BigDecimal valorNegocio) {
    this.valorNegociado = valorNegocio;
  }

  public LocalDate getDataDaEntrega() {
    return dataDaEntrega;
  }

  public void setDataDaEntrega(LocalDate dataDaEntrega) {
    this.dataDaEntrega = dataDaEntrega;
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

}
