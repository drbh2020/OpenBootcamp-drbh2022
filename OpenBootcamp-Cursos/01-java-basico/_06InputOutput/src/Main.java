import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            InputStream fichero = new FileInputStream("C:\\Users\\PC\\Desktop\\fix.txt");

            //Leer como Array de bytes (Todo)
            /*
            byte[] datos = fichero.readAllBytes();
            for (byte dato : datos) {
                System.out.println((char)dato);
            }
            */

            //Leer como enteros (uno por uno)
            /*
            int dato = fichero.read();
            while (dato != -1) {
                System.out.println((char)dato);
                dato = fichero.read();
            }
            */

            //Leer de trozitos en trozitos
            /*
            byte[] datos = new byte[5];
            int dato = fichero.read(datos);
            while (dato != -1) {
                System.out.println(Arrays.toString(datos));
                dato = fichero.read(datos);
            }
            */

            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            int dato = ficheroBuffer.read();
            while (dato != -1) {
                System.out.println((char)dato);
                dato = ficheroBuffer.read();
            }

        } catch(FileNotFoundException e) {
            System.out.println("Oye, que el programa da error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Oye, que el programa da error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}