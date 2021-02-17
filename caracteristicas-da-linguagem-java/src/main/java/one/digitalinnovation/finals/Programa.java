package one.digitalinnovation.finals;

public class Programa {

    public static void main(String[] args) {
        //eh possivel criar instancia da classe, mas não extender
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();
        // por ser final, não é possível alterar depois o valor atribuido a variavel.
        final var game = "PUBG";

        //game = "WoW";

        System.out.println(casualGamer.play(game));


    }

}
