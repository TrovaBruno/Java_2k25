import java.util.Scanner;

public class exercicio4pt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.println("Digite o valor de y: ");
        int y = sc.nextInt();


        while(x  != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if(x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }
            else if(x==0 || y==0 ){
                System.out.println("-");
            }
            x = sc.nextInt();
            y = sc.nextInt();

        }


        sc.close();
    }
}
