
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Definir objeto Scanner

        System.out.print("\nRESTAURANT \n");

        // Registro de objetos

        System.out.print("\nIngrese el nombre del cocinero: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese los años de experiencia del cocinero: ");
        int experiencia = sc.nextInt();
        System.out.print("Ingrese la especialidad del cocinero: ");
        String especialidad = sc.nextLine();
        sc.nextLine();
        System.out.print("\n¡Registro exitoso!\n");

        Cocinero cocinero1 = new Cocinero(nombre, experiencia , especialidad);

        System.out.print("\nIngrese el nombre del cocinero: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese los años de experiencia del cocinero: ");
        experiencia = sc.nextInt();
        System.out.print("Ingrese la especialidad del cocinero: ");
        especialidad = sc.nextLine();
        sc.nextLine();
        System.out.print("\n¡Registro exitoso!\n");

        Cocinero cocinero2 = new Cocinero(nombre, experiencia , especialidad);

        System.out.print("\nIngrese el nombre del cocinero: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese los años de experiencia del cocinero: ");
        experiencia = sc.nextInt();
        System.out.print("Ingrese la especialidad del cocinero: ");
        especialidad = sc.nextLine();
        sc.nextLine();
        System.out.print("\n¡Registro exitoso!\n");

        Cocinero cocinero3 = new Cocinero(nombre, experiencia , especialidad);

        // Metodos

        cocinero1.mostrarInformacion();
        cocinero2.mostrarInformacion();
        cocinero3.mostrarInformacion();


        sc.close();
    }
}
