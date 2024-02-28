import java.util.Scanner;

public class ATV1LISTA3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char res;
        do {
            System.out.println("Digite as horas que deseja realizar a conversão. ex: 14:25");
            String horas = sc.next();
            saida(horas);
            
            System.out.println("Deseja fazer nova consulta? S/N");
            res = sc.next().charAt(0);
            
        } while (res == 'S');

        System.out.println("Programa encerrado");

        sc.close();
      
    }

    public static int[] conversor(String horas) {
        
        String[] horasString = horas.split(":");
        int[] horasInt = new int[2];

        for(int i = 0; i < horasString.length; i++) {
            horasInt[i] = Integer.parseInt(horasString[i]);
        }

        

        return horasInt;
    }

    public static void saida(String horasString  ) {
        int horasInt[] =  conversor(horasString);
        
        if(horasInt[0] < 12 && horasInt[0] > 0) {
            System.out.printf("%d:%d A" ,horasInt[0]  , horasInt[1]);
        }

        else if (horasInt[0] == 00) {
            System.out.printf("%d:%d A" ,(horasInt[0]+12)  , horasInt[1]);
        }

        else if (horasInt[0] == 12) {
            System.out.printf("%d:%d P" ,horasInt[0]  , horasInt[1]);

        }

        else if (horasInt[0] > 12) {
            System.out.printf("%d:%d P" , (horasInt[0]-12) , horasInt[1]);

        }
    }
}

