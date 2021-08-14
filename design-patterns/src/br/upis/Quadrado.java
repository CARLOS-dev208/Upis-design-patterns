package br.upis;

public class Quadrado implements IFiguraBiDimensional{


    private int lado;

    private boolean condEx(int c) {
        return c > 0;
    }

    public Quadrado() {
        this.lado = 1;
    }

    public Quadrado(int lado) {
        if(!condEx(lado)) {
            throw new RuntimeException("impossivel construir quadrado");
        }
        this.lado = lado;

    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if(condEx(lado)){
            this.lado = lado;
        }
    }

    

    public String toString() {
        return("(" + this.lado + ")");
    }



    @Override
    public double semiPerimeter() {
        return (lado*4);
    }

    @Override
    public double calculateArea() {
        return (lado*lado);
    }
}
