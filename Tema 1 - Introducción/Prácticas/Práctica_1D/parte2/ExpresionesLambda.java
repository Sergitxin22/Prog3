import java.util.ArrayList;
import java.util.List;

public class ExpresionesLambda {

    public static String unir(List<String> lista) {
        StringBuilder stringBuilder = new StringBuilder();

        String delimitador = "";
        
        for (String str : lista) {
            stringBuilder.append(delimitador);
            stringBuilder.append(str.toUpperCase());

            delimitador = ", ";
        }

        return stringBuilder.toString();
    }

    public static String unirInterface(List<String> lista, Conversor conversor) {
        StringBuilder stringBuilder = new StringBuilder();

        String delimitador = "";
        
        for (String str : lista) {
            stringBuilder.append(delimitador);
            // ahora es el objeto recibido el que decide la conversión
            stringBuilder.append(conversor.convertir(str));

            delimitador = ", ";
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
    
        // este código únicamente funciona a partir de Java 9
/*     private List<String> lista = List.of(
        "Broccoli",
        "Onions",
        "Mushrooms",
        "Tomatoes",
        "Peppers"
    ); */

        List<String> lista = new ArrayList<String>();
        lista.add("Broccoli");
        lista.add("Onions");
        lista.add("Mushrooms");
        lista.add("Tomatoes");
        lista.add("Peppers");

        // Tenemos una lista de objetos String que
        // debemos unir en un único String, pero antes
        // queremos convertir cada String a mayúsculas.
        
        // 1. Implementa un método que reciba la lista
        // de objetos String anterior y devuelta un
        // único string con el resultado de unir todos
        // Strings en uno (separados por comas) y
        // convertidos a mayúsculas.
        // Llama al método implementado y comprueba que
        // funciona correctamente imprimiendo el resultado
        // por pantalla.

        String resultado = unir(lista);
        System.out.println(resultado);

        // 2. Ahora implementa un nuevo método, similar al anterior,
        // pero que permita especificar la operación a realizar
        // sobre cada String antes de unirlo. Es decir, el método
        // debe recibir un objeto que implemente la interface 
        // 'Conversor' y que determine qué operación se realiza
        // sobre cada String antes de unirlo al String total.
        // LLama a este nuevo método tanto para mayúsculas como
        // para minúsculas. Usa interfaces anónimas para implementar
        // la interfaz según necesites.

        // La interfaz Conversor se implementa en la propia llamada
        // donde se necesita como una clase anómima.
        String mayusculas = unirInterface(lista, new Conversor(){

            @Override
            public String convertir(String str) {
                return str.toUpperCase();
            }
            
        });

        System.out.println(mayusculas);

        // Ahora vamos a hacerlo en dos partes, lo que suele ser
        // útil si vamos a reutilizar la implementación de la interfaz
        // en otras llamadas.

        Conversor aMinusculas = new Conversor() {

            @Override
            public String convertir(String str) {
                return str.toLowerCase();
            }
            
        };

        String minusculas = unirInterface(lista, aMinusculas);
        System.out.println(minusculas);

        // 3. Ahora vuelve a realizar la llamada al último método que
        // has añadido, pero usando expresiones lambda.
        // Recuerda que una interfaz lambda debe ser compatible con
        // una interfaz. En este caso debe ser compatible con la 
        // interfaz Conversor, por lo que puedes usar una expresión
        // lambda que reciba un String y devuelva un String.

        // la expresión s -> s.toLowerCase() es una lambda que al objeto
        // String que recibe como parámetro le aplica el método toLowerCase,
        // que devuelve un String. Esto es compatible con la interfaz Conversor,
        // por eso podemos pasarla en dicho lugar de la llamada.
        
        minusculas = unirInterface(lista, s -> s.toLowerCase());
        System.out.println(minusculas);

        mayusculas = unirInterface(lista, s -> s.toUpperCase());
        System.out.println(mayusculas);


        // 4. Substituye las expresiones lambda anteriores por referencias a 
        // métodos.

        minusculas = unirInterface(lista, String::toLowerCase);
        System.out.println(minusculas);

        mayusculas = unirInterface(lista, String::toUpperCase);
        System.out.println(mayusculas);
    }
}