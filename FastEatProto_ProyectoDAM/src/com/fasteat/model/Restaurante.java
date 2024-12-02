package com.fasteat.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class Restaurante {
    private int idRestaurante;
    private String nombre;
    private String direccion;
    private Map<String, Double> menu; 

    // Constructor
    public Restaurante(int idRestaurante, String nombre, String direccion) {
        this.idRestaurante = idRestaurante;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y Setters
    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map<String, Double> getMenu() {
        return menu;
    }

    // Método para cargar el menú desde un archivo JSON
    public void cargarMenuDesdeJSON(String rutaArchivo) {
        try (FileReader reader = new FileReader(rutaArchivo)) {
            Gson gson = new Gson();
            Type tipoMapa = new TypeToken<Map<String, Double>>() {}.getType();
            this.menu = gson.fromJson(reader, tipoMapa);
        } catch (IOException e) {
            System.err.println("Error al cargar el menú desde JSON: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "idRestaurante=" + idRestaurante +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", menu=" + menu +
                '}';
    }
}
