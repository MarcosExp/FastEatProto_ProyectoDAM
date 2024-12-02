package com.fasteat.main;

import com.fasteat.model.Usuario;
import com.fasteat.model.Restaurante;
import com.fasteat.model.Pedido;

public class Main {
    public static void main(String[] args) {
        // Crear un Usuario
        Usuario usuario = new Usuario(1, "Juan Pérez", "juan.perez@email.com");
        System.out.println("Usuario creado: " + usuario);

        // Crear un Restaurante
        Restaurante restaurante = new Restaurante(1, "FastEat Burger", "Calle Principal 123");
        restaurante.cargarMenuDesdeJSON("src/resources/menuProto.json");
        System.out.println("Restaurante creado: " + restaurante);

        // Crear un Pedido
        Pedido pedido = new Pedido(1, usuario.getIdUsuario(), restaurante.getIdRestaurante(), "Menú infantil", false, 19.00);
        System.out.println("Pedido creado: " + pedido);
    }
}
