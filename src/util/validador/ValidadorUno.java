package util.validador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorUno implements Validador{

    private static Scanner scanner = new Scanner(System.in);
    public static double validarDouble(String mensaje){
        double numero = 0;
        do {
            System.out.println(mensaje);
            try {
                numero = scanner.nextDouble();
            } catch (InputMismatchException ex) {
                numero = -1.0;
            }
            scanner.nextLine();
        }while (numero == -1.0);
        return numero;
    }

    public static int validarOpcion(){
        int opcion = 0;
        try {
            opcion = scanner.nextInt();
        } catch (InputMismatchException ex){
            opcion =  0;
        }
        scanner.nextLine();
        return opcion;
    }

    public static int validarInt(String mensaje){
        int numero = 0;
        do {
            System.out.println(mensaje);
            try {
                numero = scanner.nextInt();
            } catch (InputMismatchException ex) {
                numero = -1;
            }
            scanner.nextLine();
        }while (numero == -1);
        return numero;
    }
}
