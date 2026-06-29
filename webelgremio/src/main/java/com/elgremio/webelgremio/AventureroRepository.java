package com.elgremio.webelgremio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Le decimos que maneje la entidad Aventurero y que su ID es de tipo Long
public interface AventureroRepository extends JpaRepository<Aventurero, Long> {
    // ¡No necesitas escribir código aquí! JpaRepository ya te regala los métodos para guardar y buscar.
}
