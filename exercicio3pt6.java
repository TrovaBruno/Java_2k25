import java.util.Locale;
import java.util.Scanner;

public class exercicio3pt6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor qualquer");
        Double valor = sc.nextDouble();

        if ( valor < 0.00 || valor > 100.0){
            System.out.println("Está fora do intervalo");
        }
        else if (valor <= 25.0){
            System.out.println(" Intervalo de (0 até 25)");
        }
        else if (valor <= 50.00){
            System.out.println("Intervalo de (25 até 50)");
        }
        else if (valor <= 75.00){
            System.out.println("Intervalo de (50 até 75)");
        }

        else if (valor <= 100.0){
            System.out.println("Intervalo de (75 até 100)");
        }
        sc.close();
    }
}
