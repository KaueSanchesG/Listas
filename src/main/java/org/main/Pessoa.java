package org.main;

import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private List<Endereco> enderecos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(){}
    public Pessoa(String nome, int idade, List<Endereco> enderecos) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = enderecos;
    }

}
