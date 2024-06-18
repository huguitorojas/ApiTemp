package com.hugo.controller;

import com.hugo.domain.model.LecturaSensor;
import com.hugo.service.SensorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor")
public class SensorController {

    private SensorService sensorService;

    public SensorController(SensorService sensorService){
        this.sensorService = sensorService;
    }
    @PostMapping
    public ResponseEntity<LecturaSensor> create(@RequestBody LecturaSensor sensor){
        return ResponseEntity.ok(sensorService.create(sensor));
    }

}
