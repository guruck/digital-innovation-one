package oo.part03.heranca.exemplo001;

public class Carro extends Veiculo{

    private int quantidadePortas;

    public Carro(String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadePortas=" + quantidadePortas + ", \'" +
                super.toString() + "\'}";
    }

    @Override
    public Double calculaImposto() {
        return this.getValorVenal() * 0.05;
    }
}
