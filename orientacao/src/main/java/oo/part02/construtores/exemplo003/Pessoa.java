package oo.part02.construtores.exemplo003;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

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
