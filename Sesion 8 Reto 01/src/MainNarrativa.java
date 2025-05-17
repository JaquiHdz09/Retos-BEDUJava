
public class MainNarrativa {

    private final TransicionHistoria transicion;

    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Narrador", "Bienvenido a la aventura. Todo es un misterio, y Adivina?,  Se acerca el anochecer...");
        dialogo.mostrarDialogo("Compañero", "¿Deberíamos investigar ese bosque o descansar aquí?, Tu elegis el camino.....");
        String eleccion = decision.obtenerDecision();
        transicion.avanzarEscena(eleccion);
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa juego = new MainNarrativa(transicion, dialogo, decision);
        juego.ejecutarEscena();
    }

}
