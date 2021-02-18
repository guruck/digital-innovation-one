package oo.part03.encapsulamento.exemplo001;

public class ProgramaExemplo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Tiago",14,8,1984);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getDataNascimento());
        System.out.println(pessoa.calculaIdade());
        pessoa.setNome("Marcao");
        System.out.println(pessoa.getNome());
    }
}
