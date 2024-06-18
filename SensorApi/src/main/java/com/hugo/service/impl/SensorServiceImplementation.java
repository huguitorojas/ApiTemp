package com.hugo.service.impl;

import com.hugo.domain.model.LecturaSensor;
import com.hugo.domain.repository.SensorRepository;
import com.hugo.service.SensorService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class SensorServiceImplementation implements SensorService {

    private SensorRepository sensorRepository;

    public SensorServiceImplementation(SensorRepository sensorRepository){
        this.sensorRepository = sensorRepository;
    }

    @Override
    public LecturaSensor create(LecturaSensor lecturaSensor) {
        return sensorRepository.save(lecturaSensor);
    }

    @Override
    public LecturaSensor findById(Long id) {
        return sensorRepository.findById(id).get();
    }

    @Override
    public List<LecturaSensor> findByDate(LocalDateTime fechaInicio, LocalDateTime fechaFinal) {
        LecturaSensor lecturaSensor = new LecturaSensor();
        List<LecturaSensor> lecturasPorFecha = new ArrayList<>();

        if(lecturaSensor.getFechaHora().isAfter(fechaInicio) && lecturaSensor.getFechaHora().isBefore(fechaFinal))
            lecturasPorFecha.add(lecturaSensor);

        return lecturasPorFecha;
    }
}
