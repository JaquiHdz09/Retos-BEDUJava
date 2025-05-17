
import java.util.*;

public class MonitorCPU {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<Double> registrosCPU = new HashSet<>(); //Con ello evitamos los duplicados

        System.out.println("🔧 Ingreso de consumo de CPU por servidor (escribe 'fin' para terminar):");

        try{
            while (true){
                System.out.println("➡️ Ingresa el consumo de CPU (%): ");
                String entrada = scanner.nextLine().trim();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                double consumo;

                try {
                    consumo = Double.parseDouble(entrada);
                }catch (NumberFormatException e){
                    System.out.println("❌ Error: El valor debe ser numérico.");
                    continue;
                }

                //Validaciones
                if (consumo < 0 || consumo > 100){
                    System.out.println("⚠️ Valor inválido: debe estar entre 0 y 100.");
                    continue;
                }

                if (!registrosCPU.add(consumo)) {
                    System.out.println("⚠️ Registro duplicado. Este valor ya fue ingresado.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("🔥 Alerta crítica: servidor con " + consumo + "% de CPU.");
                }

                System.out.println("✅ Registro guardado correctamente.");
            }

            System.out.println("\n📊 Registros finales:");
            for (double valor : registrosCPU) {
                System.out.println("• " + valor + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println("🚨 EXCEPCIÓN DETECTADA: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("🔒 Recurso cerrado. Fin del monitoreo.");
        }
    }
}