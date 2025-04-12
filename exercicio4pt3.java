import java.util.Scanner;

public class exercicio4pt3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;



        System.out.println("Muito Obrigado");

        while(numero != 4){
            if (numero == 1){
                alcool = alcool + 1;
            }
            else if (numero == 2){
                gasolina = gasolina + 1;
            }
            if (numero == 3){
                diesel = diesel + 1;
            }
            
            numero = sc.nextInt();
        }


        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
