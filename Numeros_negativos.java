import java.util.Scanner;
import java.util.Locale;

public class Numeros_negativos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite uma quantidade de número a serem exibidos");
        int n = sc.nextInt();
        
        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite um número de até no maximo 10");
            vetor[i] = sc.nextInt();
        }

        System.out.println(("NÚMEROS NEGATIVOS: "));
        
        for (int i=0; i<n; i++){
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            } 
        }
    


        sc.close();
    }
}