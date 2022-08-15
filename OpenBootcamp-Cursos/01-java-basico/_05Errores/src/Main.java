import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Errores
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try {
            int resultado = numeroA / numeroB;
            System.out.println("Resultado es: " + resultado);

        }
        catch (ArithmeticException e){
            System.out.println("b00m!, excepción es: " + e.getClass());
            int resultado = numeroA / 1;
        } catch (Exception e){
            System.out.println("Estoy en una excepción que no es aritmética");
        } finally {
            System.out.println("finally");
        }
        //De ejecución: falta validar al dividir entre 0



        //Error lógico: debería ser menor a 15 en vez mayor o igual a 25
        int temperatura = 25;
        if (temperatura >= 25) {
            System.out.println("Hace frio!");
        }

    }
}