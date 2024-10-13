import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsoDeOptional {

    // este código únicamente funciona a partir de Java 9
/*     private static List<String> lista = List.of(
        "Broccoli",
        "Onions",
        "Mushrooms",
        "Tomatoes",
        "Peppers"
    ); */
    
    private static List<String> lista = new ArrayList<>();

    public static void main(String[] args) {
        // en Java 8 debemos crear la lista de esta forma
        lista.add("Broccoli");
        lista.add("Onions");
        lista.add("Mushrooms");
        lista.add("Tomatoes");
        lista.add("Peppers");

        // Vamos a buscar un string que existe
        Optional<String> str = buscar("Tom");
       
        // Antes de imprimir podemos comprobar si el
        // optional contiene un valor no nulo
        if (str.isPresent()) {
            System.out.println(str.get());
        }

        // Normalmente se usará la siguiente expresión lambda
        // para realizar la comprobación e indicar la acción.
        // En este caso imprimir por pantalla, que lo indicamos
        // con una referencia al método println
        str.ifPresent(System.out::println);

        // La expresión anterior admite también la posibilidad
        // de indicar qué se hace si el Optional está vacío.
        // La primera expresión lambda es una referencia a un método
        // que recibe un String y no devuelve nada.
        // La segunda expresión lambda es no tiene argumentos e imprime
        // el un mensaje directamente.
        str = buscar("AAAA");
        str.ifPresentOrElse(System.out::println, () -> System.out.println("No encontrado"));
        
    }

    // Método que realiza una búsqueda en la lista de Strings
    // El método devuelve optional para poder indicar aquellos
    // casos en los que no se ha obtenido el resultado buscado.
    public static Optional<String> buscar(String str) {
        for (String s : lista) {

            // hemos encontrado el String
            if (s.startsWith(str)) {
               return Optional.of(s); 
            }
        }

        // no hemos encontrado el String buscado
        // devolvemos un Optional vacío
        return Optional.empty();
    }
}