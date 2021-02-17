package part01.paradigma.exemplo001;

public class Pessoa {

    private String nome = "marco";

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
