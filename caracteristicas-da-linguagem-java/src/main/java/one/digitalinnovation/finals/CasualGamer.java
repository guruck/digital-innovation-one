package one.digitalinnovation.finals;

public class CasualGamer extends Gamer {

    @Override
    public String keyboard() {
        return "Simple keyboard...";
    }

   /* @Override
    public String mouse() {
        return super.mouse();
    }*/

    public String play(final String game) {
        //recebendo um parametro final, não é possível alterar o parametro recebido.
        //game = "WoW";

        return "Jogando "+ game;
    }
}
