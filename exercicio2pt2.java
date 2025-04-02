import java.util.Scanner;

public class exercicio2pt2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;

        double area = pi * raio*2;

        System.out.println(" A= " + area);

        sc.close();
    }
}
