package oo.part02.construtores.exemplo002;

public class Pessoa {

    private String nome = "marco";

    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String falarMeuProprioNome(){
        return "Olá, meu nome é " + getNome();
    }
}
