import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATV2LISTA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de pagamento");
        System.out.println("Digite o valor total a ser pago:");
        double total = sc.nextDouble();
        List<Double> relatorio = new ArrayList<>();
        
        while(total > 0) {
            System.out.print("Digite o valor da prestação");
            Double value = sc.nextDouble();
            System.out.print("Digite o total de dias em atraso");
            int diasAtraso = sc.nextInt();

            System.out.println("Valor a ser pago:" + String.format("%.2f" ,valorPagamento(diasAtraso, value)));

            total -= value;

            System.out.println("Total restante " + String.format("%.2f", total));
            relatorio.add(valorPagamento(diasAtraso, value));

        }

        double soma = 0;
        for(Double valores : relatorio) {
            soma += valores;
            System.out.println("Prestação n " + (relatorio.indexOf(valores)  + 1)  + " value " + String.format("%.2f", valores));

        }
        System.out.println("TOTAL PAGO NO DIA " + String.format("%.2f", soma));
        sc.close();
        
    }

    public static Double valorPagamento(int diasAtraso, Double value ) {
        if(diasAtraso > 0) {
            return value + (value * 0.03) + ((value * 0.001) * diasAtraso);
            
        }
        else {
            return value;
        }

       

    }
}
