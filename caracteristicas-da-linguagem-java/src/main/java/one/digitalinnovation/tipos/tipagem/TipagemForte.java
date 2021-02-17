package one.digitalinnovation.tipos.tipagem;

public class TipagemForte {
// uma vez atribuido o TIPO à variável, não é possível mudá-lo.
    public static void main(String[] args) {

        String texto = "meu texto";

        //texto = 1000; //NOK

        Integer numero = Integer.valueOf("1024");

        numero = 512; //OK
    }

}
