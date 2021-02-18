package oo.part03.heranca.exemplo001;

public class ProgramaExemplo {
    public static void main(String[] args) {

        Carro carro = new Carro("Nissam","March", 2021);
        carro.setQuantidadePortas(4);
        carro.setVariante("Carro");
        carro.setValorVenal(1000.00);
        System.out.println( carro.toString()  + "; R$" + carro.calculaImposto());

        Motocicleta motocicleta = new Motocicleta("Ducati", "StreetFighter",2020);
        motocicleta.setCilindradas("850");
        motocicleta.setVariante("motoca");
        motocicleta.setValorVenal(1000.00);
        motocicleta.acelera();
        System.out.println( motocicleta.toString() + "; R$" + motocicleta.calculaImposto() );
    }

}
