
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {

        // Se crea la lista segura de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agrego los temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Redes Computacionales", 2));
        temas.add(new Tema("Lenguajes de Interfaz", 1));

        // Repositorio concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/matematicas");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Redes Computacionales", "https://recursos.edu/historia");
        recursos.put("Lenguajes de Interfaz", "https://recursos.edu/tecnologia");

        // Aqui se muestran los temas ordenados por título
        System.out.println("📋 Temas ordenados alfabéticamente:");
        Collections.sort(temas);
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Se ordena por prioridad ascendente
        System.out.println("\n🔥 Temas ordenados por prioridad (1 = urgente):");
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Se muestran los recursos compartidos
        System.out.println("\n📂 Repositorio de recursos:");
        for (String titulo : recursos.keySet()) {
            System.out.println("🔑 " + titulo + " → " + recursos.get(titulo));
        }
    }

}
