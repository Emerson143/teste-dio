package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private string nome;
    private string cor;
    private integere idade;

    public Gato (){}

    public Gato(string nome, string cor, integere idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getCor() {
        return cor;
    }

    public void setCor(string cor) {
        this.cor = cor;
    }

    public integere getIdade() {
        return idade;
    }

    public void setIdade(integere idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

   
    }
}

