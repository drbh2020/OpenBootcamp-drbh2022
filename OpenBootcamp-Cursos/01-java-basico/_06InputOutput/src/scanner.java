import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        try {

            /*
            Scanner scanner = new Scanner(System.in);
            System.out.print("Mete un número: ");
            //int a = scanner.nextInt();
            //int b = scanner.nextInt();
            String a = scanner.next();
            String b = scanner.next();
            System.out.println("Enteros son: " + a + " " + b);
            */

            //Técnica del flag para validación
            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Mete dos número: ");
                //scanner.reset();
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Números inválidos");
                }
            } while(!ok);

            //PrintStream
            PrintStream info = new PrintStream("copia.txt");
            info.println("Hola");
            System.out.print("Holi");

            InputStream fichero = new FileInputStream("C:\\Users\\PC\\Desktop\\fix.txt");
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
