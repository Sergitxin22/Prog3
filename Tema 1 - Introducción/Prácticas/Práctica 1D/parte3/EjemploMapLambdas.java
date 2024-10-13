import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;
import java.util.function.BiFunction;

// Este ejercicio demuestra cómo es posible crear
// un mapa de expresiones lambda que relaciona un string
// con el nombre de la operación con la expresión lambda
// Todas las expresiones lambda deben ser compatibles con
// la interfaz BiFunction<T, U, R>
public class EjemploMapLambdas {

    public static void main(String[] args) {
        // creamos la lista para guardar las operaciones
        Map<String, BiFunction<Integer, Integer, Float>> operaciones = new HashMap<>();

        // añadimos la operaciones a la lista como expresiones lambda
        operaciones.put("+", (x, y) -> (float) x + y); // suma
        operaciones.put("-", (x, y) -> (float) x - y); // resta
        operaciones.put("*", (x, y) -> (float) x * y); // multiplicación
        operaciones.put("/", (x, y) -> x / (float) y); // división

        // ahora vamos a pedir al usuario dos números enteros
        try (Scanner scanner = new Scanner(System.in)) {
            // lectura del primer operando
            System.out.print("Primer operando: ");
            Integer opA = scanner.nextInt();
            
            // lectura del segundo operando
            System.out.print("Segundo operando: ");
            Integer opB = scanner.nextInt();

            // vamos a aplicar todas las operaciones una a una sobre los operandos
            // recorriendo las parejas de nombre, expresión lambda del mapa
            for (Entry<String, BiFunction<Integer, Integer, Float>> entry : operaciones.entrySet() ) {
                // ahora vamos a sacar cada operación con una información de operadores, operando y resultado
                String operador = entry.getKey();
                float resultado = entry.getValue().apply(opA, opB);
                System.out.format("%d %s %d = %.2f%n", opA, operador, opB, resultado);
            }
        }
    }

}