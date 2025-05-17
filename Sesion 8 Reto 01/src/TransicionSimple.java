

public class TransicionSimple implements TransicionHistoria {

    @Override
    public void avanzarEscena(String decision) {
        if ("A".equalsIgnoreCase(decision)) {
            System.out.println("➡️ La historia avanza hacia el bosque oscuro..." +
                    "Pero..." +
                    "Todo estará bien?");
        } else {
            System.out.println("➡️ Te quedas en el pueblo a descansar, sin embargo tu alma no esta tranquila, estas seguro de haber elegido bien?.");
        }
    }

}
