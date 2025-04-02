
import java.util.Scanner;

public class exercicio2pt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu número");
        int numero = sc.nextInt();
        System.out.println("Digite o seu número de horas trabalhada");
        double horas_trabalhadas = sc.nextDouble();
        System.out.println("Digite o valor que você recebe por hora");
        double valor_hora = sc.nextDouble();

        double salario = horas_trabalhadas * valor_hora;

        System.out.println("Number = " + numero);
        System.out.println("Salary = " + salario);

        sc.close();


    }
}
