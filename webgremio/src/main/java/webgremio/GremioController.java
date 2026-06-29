package webgremio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GremioController {

    @GetMapping("/saludo")
    public String saludarWeb() {
        return "¡Hola Mundo! El Gremio de Aventureros ya está online en Spring Boot. ⚔️🌐";
    }

    // --- NUEVO ENDPOINT ---
    @GetMapping("/aventurero")
    public Aventurero obtenerAventurero() {
        // Creamos un objeto de Java normal y corriente
        Aventurero heroe = new Aventurero("Gretel", "Cazadora", 12);

        // ¡Se lo devolvemos directamente a Spring Boot!
        return heroe;
    }

    @GetMapping("/gremio")
    public List<Aventurero> obtenerGremio() {
        // 1. Creamos la lista dinámica
        List<Aventurero> lista = new ArrayList<>();

        // 2. Llenamos la lista con varios personajes
        lista.add(new Aventurero("Gretel", "Cazadora", 12));
        lista.add(new Aventurero("Hansel", "Caballero", 8));
        lista.add(new Aventurero("Legolas", "Arquero", 25));

        // 3. Devolvemos la lista completa
        return lista;
    }
}
