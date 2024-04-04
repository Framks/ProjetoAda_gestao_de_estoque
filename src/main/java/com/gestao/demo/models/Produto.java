package com.gestao.demo.models;


public class Produto {
    private Long id;
    private String nome;
    private Integer quantidade;
    private Double preco;

    public Produto(){
    }
    public Produto(Long id, String nome, Integer qtd, Double valor_uni) {
        this.id = id;
        this.nome = nome;
        this.quantidade = qtd;
        this.preco = valor_uni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer qtd) {
        this.quantidade = qtd;
    }

    public Double getpreco() {
        return preco;
    }

    public void setpreco(Double valor_uni) {
        this.preco = valor_uni;
    }
}
