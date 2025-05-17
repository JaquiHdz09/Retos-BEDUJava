
public class Principal {
    public static void main(String[] args) {

        Entrada entrada1 = new Entrada("Concierto de Caifanes", 1340.0);
        Entrada entrada2 = new Entrada("Obra de teatro en bellas artes", 560.0);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        Entrada_record entrada3 = new Entrada_record("Hackaton", 1900.0);
        Entrada_record entrada4 = new Entrada_record("Concurso de robotica", 300.0);

        entrada3.mostrarInformacion();
        entrada4.mostrarInformacion();
    }
}

