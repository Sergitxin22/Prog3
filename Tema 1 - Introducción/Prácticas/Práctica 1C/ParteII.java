import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ParteII {

    // creación del logger para la clase
    // el nombre pasado se obtiene de la propia clase
    private static Logger logger = Logger.getLogger(ParteII.class.getName());

    public static void main(String[] args) {
        // vamos a leer el fichero de configuración del logger
        try (FileInputStream fis = new FileInputStream("logger.properties")) {
            LogManager.getLogManager().readConfiguration(fis);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "No se pudo leer el fichero de configuración del logger");
        }

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