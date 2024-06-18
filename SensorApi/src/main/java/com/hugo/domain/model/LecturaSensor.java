package com.hugo.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class LecturaSensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private double temperatura;

    private double humedadAmbiente;

    private double humedadSuelo;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaHora;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedadAmbiente() {
        return humedadAmbiente;
    }

    public void setHumedadAmbiente(double humedadAmbiente) {
        this.humedadAmbiente = humedadAmbiente;
    }

    public double getHumedadSuelo() {
        return humedadSuelo;
    }

    public void setHumedadSuelo(double humedadSuelo) {
        this.humedadSuelo = humedadSuelo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
