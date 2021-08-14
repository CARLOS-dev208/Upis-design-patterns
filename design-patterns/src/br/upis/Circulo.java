package br.upis;

public class Circulo implements IFiguraBiDimensional{

    private float raio;

    private boolean condEx(int c) {
        return c > 0;
    }

    public Circulo() {
        this.raio = 1;
    }

    public Circulo(int raio) {
        if(!condEx(raio)) {
            throw new RuntimeException("impossivel construir circulo");
        }
        this.raio = raio;

    }

    public float getLado() {
        return raio;
    }

    public void setLado(int raio) {
        if(condEx(raio)){
            this.raio = raio;
        }
    }

    @Override
    public double semiPerimeter() {
        double pi = Math.PI;
        return (2*raio*pi);
    }

    @Override
    public double calculateArea() {
        double pi = Math.PI;
        return (pi*raio*raio);
    }

    public String toString() {
        return("(" + this.raio + ")");
    }

}
//perimeter = C = 2·π·r
//area do circle A = π·r2