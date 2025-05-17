public class Principal {

    public static void main(String[] args) {

        Pasajero pasajero1 = new Pasajero("Ana Martínez", "X123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.");
        }

        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

        System.out.println("\n❌ Cancelando reserva...");
        vuelo.cancelarReserva();

        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

        System.out.println();
        vuelo.reservarAsiento("Mario Gonzalez", "Y987654");
        System.out.println(vuelo.obtenerItinerario());
    }

}
