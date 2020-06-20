package aulaseis;

public abstract class Pessoa {
    private String nome;
    public Pessoa (String nome) {
        this.nome = nome;
    }

public String toString() {
    return nome;
}        
}

