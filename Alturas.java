import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double alturaMedia, percentualMenores;

        System.out.println("Quantas pessoas serão digitadas");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];

        for (int i=0; i<n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.println("Nome: ");
            nomes[i]= sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            altura[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma = soma + altura[i];
        }
        double mediaAltura = soma /n;

        System.out.println();
        System.out.printf("Altura média: %.2f", mediaAltura);

        int cont = 0;
        for (int i=0; i<n; i++){
            if (idades[i]< 16){
                cont = cont + 1;
            }
        }
        double percent = cont * 100.0 / n;

        System.out.println();
        System.out.printf("Pessoas com menos 16 anos: %.1f%%%n ", percent);

        for (int i=0; i<n; i++){
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();

    }
}

