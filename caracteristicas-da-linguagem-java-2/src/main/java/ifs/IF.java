package ifs;

public class IF {

  public static void main(String[] args) {

    final var condicao = false;
    final var numero = 3;

    if (condicao) {
      System.out.println("A condição é verdadeira");
    } else {
      System.out.println("A condição é falsa");
    }

    if (condicao)
      System.out.println("Uma única linha...");

    final var ternario = condicao ? "é verdadeira" : "é falsa";

    System.out.println(ternario);

    switch (numero){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }

  }
}
