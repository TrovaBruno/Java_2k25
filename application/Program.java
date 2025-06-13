package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N");
        int n = sc.nextInt();

        int math [] [] = new int[n][n];

        // System.out.println("Digite os valores da posição 0:0; 0:1; 0:2");
        for (int i=0; i<math.length; i++){
            for (int j=0; j<math[i].length; j++){
                math[i][j] = sc.nextInt();
            }
        }

        System.out.println("main diagonal");
        for (int i=0; i<math.length; i++){
            System.out.println(math[i][i] + " ");
        }

        int count = 0;
        for (int i=0; i<math.length; i++){
            for (int j=0; j<math[i].length; j++){
                if (math[i][j] < 0){
                    count ++;
                }
            }
        }
        System.out.println("Negative numbers =" + count);
        sc.close();
    }
}