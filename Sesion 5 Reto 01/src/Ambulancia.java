
public class Ambulancia extends UnidadEmergencia {

    private SistemasGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulancia(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemasGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder() {
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println();
    }
}
