import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("what multiplication table?: ");
        int num = input.nextInt();
        int contador = input.nextInt();
        int resultado = input.nextInt();

        
        contador = 0;
        while (contador <= 10) {
            resultado = num * contador;
            System.out.println(num + " X " + contador + " = " + resultado);
            contador = contador + 1;

        }

        input.close();
    }

}
