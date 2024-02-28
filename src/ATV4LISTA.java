import java.util.Scanner;

public class ATV4LISTA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int number = sc.nextInt();
        
        String numberSTR = "";
        @SuppressWarnings("static-access")
        String[] tamanho = numberSTR.valueOf(number).split("");


        for(int i = tamanho.length; i > 0; i--) {
            System.out.print(tamanho[i-1]);
        }

        sc.close();
    }
    
}
