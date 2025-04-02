import java.util.Scanner;

public class exercicio2pt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B");
        int B = sc.nextInt();
        System.out.println("Digite o valor de C");
        int C = sc.nextInt();
        System.out.println("Digite o valor de D");
        int D = sc.nextInt();


        int multiplica = A * B;
        int multiplica2 = C * D;

        int diferenca = (multiplica - multiplica2);

        System.out.println("Diferenca= " + diferenca);

        sc.close();

    }
}