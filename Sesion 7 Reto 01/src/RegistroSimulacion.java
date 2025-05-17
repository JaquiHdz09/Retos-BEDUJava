import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {

        // Paso 1.- Se define la ruta del archivo
        Path rutaDirectorio = Paths.get("config");
        Path rutaArchivo = rutaDirectorio.resolve("parametros.txt");

        // Paso 2.- Se hace la lógica de simulación
        try {
            guardarParametros(rutaDirectorio, rutaArchivo);
            if (Files.exists(rutaArchivo)) {
                System.out.println("✅ Archivo creado correctamente.");
                leerParametros(rutaArchivo);
            } else {
                System.out.println("❌ El archivo no fue creado.");
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    // Paso 3.- Se crean el Método para guardar los parámetros en el archivo
    public static void guardarParametros(Path dir, Path archivo) throws IOException {
        if (!Files.exists(dir)) {
            Files.createDirectories(dir);
            System.out.println("📁 Carpeta 'config/' creada.");
        }

        String parametros = """
            Tiempo de ciclo: 55.8 segundos
            Velocidad de línea: 1.2 m/s
            Número de estaciones: 8
            """;

        Files.write(archivo, parametros.getBytes());
        System.out.println("📝 Parámetros guardados en: " + archivo.toAbsolutePath());
    }

    // Paso 4.- Se hace el Método para leer y mostrar los parámetros
    public static void leerParametros(Path archivo) throws IOException {
        String contenido = Files.readString(archivo);
        System.out.println("\n📄 Contenido del archivo:");
        System.out.println(contenido);
    }
}

