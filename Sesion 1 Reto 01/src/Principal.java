import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingresa el número de expediente: ");
        String expediente = scanner.nextLine();

        Paciente paciente = new Paciente(nombre, edad, expediente);

        System.out.println("\nInformación del Paciente:");
        paciente.mostrarInformacion();

        scanner.close();
    }
}
