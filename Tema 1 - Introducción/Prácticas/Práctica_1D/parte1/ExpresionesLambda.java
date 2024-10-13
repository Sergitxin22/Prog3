
// Este ejercicio contiene diferentes partes que se deben ir completando
// paso a paso.

public class ExpresionesLambda {

	// 1. Declara una interfaz funcional llamada Conversor,
    // crea un fichero aparte para esta nueva interfaz, 
    // que contenga un único método llamado convertir(...)
    // que reciba un String como parámetro y otro String.

    // 2. Implementa, en una clase llamada Mayusculas, la
    // interfaz Conversor anterior. El método convertir debe
    // devolver el string recibido convertido a mayúsculas.
    
	public static void main(String[] args) {
      
		String entrada = "¡Hola mundo!";
     
	    // 3. Ahora utiliza la clase que acabas de implementar
	    // para convertir el string 'entrada' e imprimir el resultado
	    // obtenido por pantalla.        
		Mayusculas mayusculas = new Mayusculas();
        System.out.println(mayusculas.convertir(entrada));
    
    
	    // 4. Realiza ahora la implementación de la interfaz
	    // Conversor en una clase anónima directamente para que
	    // convierta a minúsculas el string recibido.
	    // Imprime el resultado obtenido por pantalla.
        Conversor minusculas = new Conversor() {
	    
        	@Override
        	public String convertir(String texto) {
        		return texto.toLowerCase();
        	}
        };
	
        System.out.println(minusculas.convertir(entrada));

	    // 5. Substituye la clase anónima anterior por una expresión
	    // lambda para realizar la misma operación de conversión a 
	    // minúsculas. Usa el conversor sobre el string anterior y
	    // e imprime el resultado por pantalla.
        Conversor minusculasLambda = texto -> texto.toLowerCase();
        System.out.println(minusculasLambda.convertir(entrada));
    

	    // 6. Piensa si puedes substituir la expresión lambda por
	    // una referencia
	
        Conversor minusculasReferencia = String::toLowerCase;
        System.out.println(minusculasReferencia.convertir(entrada));    
    }
}