import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.BiFunction;

// Este ejercicio demuestra cómo es posible crear
// un lista de expresiones lambda que pueden ser
// utilizadas para realizar distintas operaciones.
// Todas ellas deben ser compatibles con la interfaz
// BiFunction<T, U, R>
public class EjemploListaLambdas {

    public static void main(String[] args) {
        // creamos la lista para guardar las operaciones
        List<BiFunction<Integer, Integer, Float>> operaciones = new ArrayList<>();

        // añadimos la operaciones a la lista como expresiones lambda
        operaciones.add((x, y) -> (float) x + y); // suma
        operaciones.add((x, y) -> (float) x - y); // resta
        operaciones.add((x, y) -> (float) x * y); // multiplicación
        operaciones.add((x, y) -> x / (float) y); // división

        // ahora vamos a pedir al usuario dos números enteros
        try (Scanner scanner = new Scanner(System.in)) {
            // lectura del primer operando
            System.out.print("Primer operando: ");
            Integer opA = scanner.nextInt();
            
            // lectura del segundo operando
            System.out.print("Segundo operando: ");
            Integer opB = scanner.nextInt();

            // vamos a aplicar todas las operaciones una a una sobre los operandos
            // recorriendo la lista de expresiones lambda
            for (BiFunction<Integer, Integer, Float> op : operaciones) {
                System.out.println(op.apply(opA, opB));
            }
        }
    }

}