package one.digitalinnovation.tipos.tipagem;

public class TipoInferido {
// à partir da versão 10, "var", com isso o proprio compilador vai saber o TIPO da variaval quando atribuido valor.
    public static void main(String[] args) {

        var numero = Integer.valueOf("123456");

        var texto = "O Numero é : " ;

        System.out.println(texto + numero);

    }

}
