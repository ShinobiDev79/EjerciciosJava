package com.elgremio.webelgremio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MisionController {

    @Autowired
    private MisionRepository misionRepository;

    @GetMapping("/misiones/crear")
    public String crearMision(){
        // Creamos el objeto
        Mision nuevo = new Mision("Derrotar al Rey Trasgo", 100, false);

        // ¡Lo guardamos
        misionRepository.save(nuevo);

        return "¡Misión del tablón guardada! 📋";
    }

    @GetMapping("/misiones")
    public List<Mision> obtenerMisiones() {

        return misionRepository.findAll();
    }
}
