/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
public class Cuadrado extends Figura {

    double lado;

    public Cuadrado(double lado, String features) {
        super(features);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = lado * lado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuadrado{");
        sb.append("lado=").append(lado);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
