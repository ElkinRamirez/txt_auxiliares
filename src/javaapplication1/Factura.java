/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ELKIN RAMIREZ
 */
public class Factura {
    
    private String cliente;
    private Fecha fecha;
    private float valorRecibido;
    private float cambio;

    public Factura(String cliente, Fecha fecha, float valorRecibido, float cambio) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.valorRecibido = valorRecibido;
        this.cambio = cambio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public float getValorRecibido() {
        return valorRecibido;
    }

    public void setValorRecibido(float valorRecibido) {
        this.valorRecibido = valorRecibido;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }
    
    
    
}
