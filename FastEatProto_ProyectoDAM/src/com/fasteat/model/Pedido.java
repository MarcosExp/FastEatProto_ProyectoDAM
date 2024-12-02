package com.fasteat.model;

public class Pedido {
    private int idPedido;
    private int idUsuario;
    private int idRestaurante;
    private String detalles;
    private boolean estado;
    private double total;

    // Constructor
    public Pedido(int idPedido, int idUsuario, int idRestaurante, String detalles, boolean estado, double total) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.idRestaurante = idRestaurante;
        this.detalles = detalles;
        this.estado = estado;
        this.total = total;
    }

    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Método para calcular el total (puede incluir lógica adicional más adelante)
    public void calcularTotal(double... precios) {
        total = 0;
        for (double precio : precios) {
            total += precio;
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", idUsuario=" + idUsuario +
                ", idRestaurante=" + idRestaurante +
                ", detalles='" + detalles + '\'' +
                ", estado='" + estado + '\'' +
                ", total=" + total +
                '}';
    }
}

