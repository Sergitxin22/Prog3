import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParteI {

    // creación del logger para la clase
    // el nombre pasado se obtiene de la propia clase
    private static Logger logger = Logger.getLogger(ParteI.class.getName());

    public static void main(String[] args) {
        // Establecemos el nivel de salida a FINE
        Logger.getLogger("").setLevel(Level.FINE);
        Logger.getLogger("").getHandlers()[0].setLevel(Level.FINE);

        // mensaje de INFO
        logger.info("El programa ha comenzado");

        // mensaje de INFO
        logger.info("Vamos a contar de 0 hasta 9");
        for (int i = 0; i < 10; i++) {
            // mensaje detallado de lo que hace el programa
            logger.fine(String.format("Vamos por la vuelta %d", i + 1));
            System.out.println(i);
        }

        // vamos a producir un error al intentar abrir un fichero que no existe
        try (FileReader reader = new FileReader("noexiste.txt")) {
            
        } catch (IOException e) {
            logger.severe("Error abriendo el fichero. " + e.getMessage());
        }

        // mensaje de INFO
        logger.info("El programa ha terminado");
    }
}