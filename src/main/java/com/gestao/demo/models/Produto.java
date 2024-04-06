package com.gestao.demo.models;


public class Produto {
    private Long id;
    private String nome;
    private String categoria;
    private Integer quantidade;
    private Double preco;

    public Produto(){
    }
    public Produto(Long id, String nome, String categoria, Integer quantidade, Double preco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
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
        return this.preco;
    }

}
