package one.digitalinnovation.tipos.naoprimitivos;

public class Unboxing {

    public static void main(String[] args) {
        int i = new Integer(3); // depreciado a partir da versão 9 do JAVA, utilizar o "valueOf"

        int inteiro = Integer.valueOf(1024);

        //boolean b = new Boolean(true);
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("false");

    }

}
