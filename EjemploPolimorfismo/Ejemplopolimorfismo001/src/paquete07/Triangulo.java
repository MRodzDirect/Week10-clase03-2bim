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
public class Triangulo extends Figura {

    double base;
    double alto;

    public Triangulo(double base, double alto, String features) {
        super(features);
        this.base = base;
        this.alto = alto;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        this.area = 0.5 * base * alto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Triangulo{");
        sb.append("base=").append(base);
        sb.append(", alto=").append(alto);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
