
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {

    @Override
    public String obtenerDecision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer?");
        System.out.println("A) Explorar el bosque");
        System.out.println("B) Quedarte en el pueblo");
        System.out.print("Elige A o B: ");
        return sc.nextLine();
    }

}
