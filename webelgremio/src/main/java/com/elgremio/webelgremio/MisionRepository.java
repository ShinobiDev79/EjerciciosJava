package com.elgremio.webelgremio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Le decimos que maneje la entidad Mision y que su ID es de tipo Long
public interface MisionRepository extends JpaRepository<Mision, Long> {

}
