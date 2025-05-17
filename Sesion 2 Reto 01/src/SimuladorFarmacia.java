import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del medicamento: ");
        String medicamento = sc.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = sc.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = sc.nextInt();

        var totalSinDescuento = precioUnitario * cantidad;

        boolean aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;
        double totalPagar = totalSinDescuento - descuento;

        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}

