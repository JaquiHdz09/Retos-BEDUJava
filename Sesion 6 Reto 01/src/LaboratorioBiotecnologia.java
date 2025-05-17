
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class LaboratorioBiotecnologia {

    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden de llegada
        ArrayList<String> muestras = new ArrayList<>();

        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");
        muestras.add("Drosophila melanogaster");

        // Paso 2: HashSet para obtener especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. López");
        idInvestigador.put("M-002", "Dr. Hernández");
        idInvestigador.put("M-003", "Mtra. Sánchez");
        idInvestigador.put("M-004", "Dr. Rivera");

        // Paso 4: Mostrar resultados
        // Lista completa en orden de llegada
        System.out.println("📥 Muestras recibidas en orden:");
        for (String especie : muestras) {
            System.out.println("- " + especie);
        }

        // Especies únicas procesadas
        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Relación de ID de muestra e investigador
        System.out.println("\n🧑‍🔬 Relación ID de muestra → Investigador:");
        for (String id : idInvestigador.keySet()) {
            System.out.println(id + " → " + idInvestigador.get(id));
        }

        // Búsqueda por ID de muestra
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n🔍 Ingresa un ID de muestra para buscar al investigador (ej: M-002): ");
        String idBuscado = scanner.nextLine();

        if (idInvestigador.containsKey(idBuscado)) {
            System.out.println("✅ Investigador responsable: " + idInvestigador.get(idBuscado));
        } else {
            System.out.println("❌ No se encontró ningún investigador con ese ID.");
        }

        scanner.close();
    }
}
