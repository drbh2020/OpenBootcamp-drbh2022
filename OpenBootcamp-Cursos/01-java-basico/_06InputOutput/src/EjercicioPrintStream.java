import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioPrintStream {
    public static void main(String[] args) {
        //Copia los datos del fichero passwd.txt hacia destino.txt
        try {
            InputStream in = new FileInputStream("src/etc/passwd.txt");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
