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
public class Rombo extends Figura {

    double diag_m;
    double diag_M;

    public Rombo(double diag_m, double diag_M, String features) {
        super(features);
        this.diag_m = diag_m;
        this.diag_M = diag_M;
    }

    public double getDiag_m() {
        return diag_m;
    }

    public void setDiag_m(double diag_m) {
        this.diag_m = diag_m;
    }

    public double getDiag_M() {
        return diag_M;
    }

    public void setDiag_M(double diag_M) {
        this.diag_M = diag_M;
    }

    @Override
    public void calcularArea() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rombo{");
        sb.append("diag_m=").append(diag_m);
        sb.append(", diag_M=").append(diag_M);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
