package oo.part03.heranca.exemplo001;

public class Motocicleta extends Veiculo{

    private String cilindradas;

    public Motocicleta(String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindradas='" + cilindradas + "\', \'" +
                super.toString() + "'}";
    }

    @Override
    public Double calculaImposto() {
        return this.getValorVenal() * 0.03;
    }
}
