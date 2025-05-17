

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Path archivoLog = Paths.get("errores.log");

        if (!Files.exists(archivoLog)) {
            try {
                Files.writeString(archivoLog, """
                    SUCCESS: Todo Genial
                    WARNING: Latencia alta :(
                    ERROR: No se pudo conectar a la base de datos
                    ERROR: Timeout en la prueba
                    SUCCESS: Test finalizado
                    WARNING: Tiempo de respuesta alto
                    """);
                System.out.println("✅ Archivo 'errores.log' creado con contenido de prueba.");
            } catch (IOException e) {
                System.out.println("❌ No se pudo crear el archivo de prueba.");
                return;
            }
        }

        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        try (BufferedReader lector = Files.newBufferedReader(archivoLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            System.out.println("\n📊 RESUMEN DEL ANÁLISIS:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + errores);
            System.out.println("Cantidad de advertencias: " + advertencias);

            if (totalLineas > 0) {
                double porcentaje = ((double) (errores + advertencias) / totalLineas) * 100;
                System.out.printf("Porcentaje con errores/advertencias: %.2f %%\n", porcentaje);
            }

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo. Se generará un log de fallos.");
            try (PrintWriter pw = new PrintWriter("registro_fallos.txt")) {
                pw.println("Error al leer el archivo errores.log:");
                pw.println(e.getMessage());
            } catch (IOException ex) {
                System.out.println("No se pudo crear el archivo de fallos.");
            }
        }
    }
}
