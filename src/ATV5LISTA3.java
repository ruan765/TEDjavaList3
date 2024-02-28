
import java.util.Random;

public class ATV5LISTA3 {

    public static void main(String[] args) {

        Random rd = new Random();

        int jogada1 = rd.nextInt(10) + 2;

        System.out.println("caiu no numero" + jogada1);

        if (jogada1 == 7 || jogada1 == 11) {

            System.out.println("Voce ganhou ");

        }

        else if (jogada1 == 2 || jogada1 == 3 || jogada1 == 12) {

            System.out.println("Você perdeu");

        }

        else {

            while (jogada1 != 7) {

                int jogada;

                System.out.println("Nova rodada");

                jogada = rd.nextInt(10) + 2;

                System.out.println("caiu no numero " + jogada);

                if (jogada == jogada1) {

                    System.out.println("Voce ganhou");

                    break;

                }

                else if (jogada == 7) {

                    System.out.println("Você perdeu");

                    break;

                }

            }

            System.out.println();

            System.out.println("Fim de jogo");

        }

    }

}
