public class matematica {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        B = Math.sqrt(y);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        C = Math.sqrt(z);
        System.out.println("Raiz quadrada de " + z + " = " + C);
System.out.println("----------------------------------------------------------");
        A = Math.pow(x, y);
        System.out.println(x + " elevado a " + y + " = " + A);
        B = Math.pow(x, 2.0);
        System.out.println(x + " elevado ao quadrado  = " + B);
        C = Math.pow( 5.0, 2.0);
        System.out.println( "5 elevado ao quadrado  = " + C);
System.out.println("----------------------------------------------------------");
        A = Math.abs(y);
        B= Math.abs (z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);


    }
}
