import java.util.Scanner;

public class suma {

    public static void main( String[] args ){
        int n, m, suma;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        n = teclado.nextInt();

        System.out.println("Introduce el numero: ");
        m = teclado.nextInt();

        suma=n+m;

        System.out.println("La suma de los numeros es: " + suma );
    }

}
