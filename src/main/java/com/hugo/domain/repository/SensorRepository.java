package com.hugo.domain.repository;
import com.hugo.domain.model.LecturaSensor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<LecturaSensor, Long> {


}
