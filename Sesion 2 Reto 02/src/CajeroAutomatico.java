
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var saldo = 1000.0;
        int opcion;

        do {

            System.out.println("\n Bienvenido al cajero automatico");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("💰 Su saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("❌ Saldo insuficiente. No es posible realizar el retiro.");
                        continue;
                    }
                    saldo -= retiro;
                    System.out.println("✅ Retiro exitoso! Su nuevo saldo: $" + saldo);
                    break;

                case 4:
                    System.out.println("👋 Gracias!, Hasta luego!, Regresa pronto!");
                    break;

                default:
                    System.out.println("❗ Opción no valida! por favor intente de nuevo!");
                    continue;
            }

        } while (opcion != 4);
    }
}
