package oo.part04.exemplo001;

public class ProgramaExemplo {
    public static void main(String[] args) {

        Carro carro = new Carro("Nissam","March", 2021,4);
        carro.setVariante("Carro");
        carro.setValorVenal(1000.00);
        System.out.println( carro.toString()  + "; R$" + carro.calculaImposto());

    }

}
