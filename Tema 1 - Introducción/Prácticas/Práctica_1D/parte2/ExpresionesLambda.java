import java.util.List;

public class ExpresionesLambda {

    public static void main(String[] args) {

        // en Java 8 debemos crear la lista de esta forma
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
        


        // Ahora vamos a hacerlo en dos partes, lo que suele ser
        // útil si vamos a reutilizar la implementación de la interfaz
        // en otras llamadas.



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
        
        

        // 4. Substituye las expresiones lambda anteriores por referencias a 
        // métodos.

        
    }
}