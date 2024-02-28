import java.util.Scanner;

/**
 * ATV3LISTA3
 */
public class ATV3LISTA3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int number = sc.nextInt();

        String numberSTR = "";
        @SuppressWarnings("static-access")
        String[] tamanho = numberSTR.valueOf(number).split("");
        
        System.out.println("O total de numero digitados é " + tamanho.length);
        

        



        sc.close();
    }
    
}