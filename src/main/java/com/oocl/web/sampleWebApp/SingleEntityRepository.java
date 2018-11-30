package com.oocl.web.sampleWebApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SingleEntityRepository extends JpaRepository<SingleEntity,Long> {
}
