package com.elgremio.webelgremio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class GremioController {

    @Autowired // Le dice a Spring que inyecte el mando a distancia automáticamente
    private AventureroRepository aventureroRepository;

    @GetMapping("/crear")
    public String crearAventurero() {
        // Creamos el objeto
        Aventurero nuevo = new Aventurero("Aragorn", "Guerrero", 15);

        // ¡Lo guardamos de forma persistente en MySQL con una sola línea!
        aventureroRepository.save(nuevo);

        return "¡Aventurero guardado con éxito en MySQL Workbench! 🗄️";
    }

    @GetMapping("/gremio")
    public List<Aventurero> obtenerGremio() {
        // Trae absolutamente todas las filas de la tabla MySQL convertidas en objetos Java
        return aventureroRepository.findAll();
    }
}
