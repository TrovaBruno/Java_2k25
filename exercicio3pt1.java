import java.util.Scanner;

public class exercicio3pt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if(numero < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("POSITIVO");
        }

        sc.close();
    }
}
