import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static List<Long> generarFibonacci(int n) {
        List<Long> resultado = new ArrayList<>();

        if (n <= 0) {
            return resultado;
        }

        long a = 0;
        long b = 1;

        for (int i = 0; i < n; i++) {
            resultado.add(a);
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos de la sucesión de Fibonacci que desea generar: ");

        try {
            int cantidad = Integer.parseInt(scanner.nextLine().trim());

            if (cantidad < 0) {
                System.out.println("Error: La cantidad debe ser mayor o igual a 0.");
                return;
            }

            List<Long> fibonacci = generarFibonacci(cantidad);

            if (fibonacci.isEmpty()) {
                System.out.println("La secuencia es vacía para una cantidad de 0.");
            } else {
                System.out.println("Secuencia de Fibonacci:");
                System.out.println(fibonacci);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}
