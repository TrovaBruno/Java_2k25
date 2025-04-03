import java.util.Scanner;

public class exercicio3pt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("São multiplos!");
        }
        else{
            System.out.println("Não são multiplos!");
        }


        sc.close();

    }
}
