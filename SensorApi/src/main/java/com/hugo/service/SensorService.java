package com.hugo.service;

import com.hugo.domain.model.LecturaSensor;

import java.time.LocalDateTime;
import java.util.List;

public interface SensorService {

    public LecturaSensor create(LecturaSensor sensor);

    public LecturaSensor findById(Long id);

    public List<LecturaSensor> findByDate(LocalDateTime fechaInicio, LocalDateTime fechaFinal);



}
