package one.digitalinnovation.classes.cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        //System.out.println(cliente.relatorio()); //está em outro pacote, não pode acessar o metodo protected
    }

}
