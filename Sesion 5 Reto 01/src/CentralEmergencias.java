
public class CentralEmergencias {

    public static void main(String[] args) {
        Ambulancia amb = new Ambulancia("Ambulancia", "Juan");
        Patrulla pat = new Patrulla("Patrulla", "Laura");
        UnidadBomberos bom = new UnidadBomberos("UnidadBomberos", "Marco");

        amb.iniciarOperacion();
        pat.iniciarOperacion();
        bom.iniciarOperacion();
    }

}
