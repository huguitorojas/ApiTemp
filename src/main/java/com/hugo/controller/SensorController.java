package com.hugo.controller;

import com.hugo.domain.model.LecturaSensor;
import com.hugo.service.SensorService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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


    @GetMapping("{id}")
    public ResponseEntity<LecturaSensor> getById(@PathVariable long id){
        return ResponseEntity.ok(sensorService.findById(id));
    }


}
