package com.example.demo;

public class Produto {

    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preco invalido");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
        

    

