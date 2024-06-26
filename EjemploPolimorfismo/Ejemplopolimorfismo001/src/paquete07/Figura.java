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
public abstract class Figura {
    
    String features;
    double area;

    public Figura(String features) {
        this.features = features;
    }
    
    abstract void calcularArea();

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return ", caracteristicas=" + features + ", area=" + area;
    }
        
    
    
}
