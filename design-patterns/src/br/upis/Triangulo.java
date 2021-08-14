package br.upis;

public class Triangulo implements IFiguraBiDimensional {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo() {
        this.ladoA = 1;
        this.ladoB = 1;
        this.ladoC = 1;
    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this();
        if (condicaoExistencia(ladoA,ladoB,ladoC)){
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        }
    }

    private boolean condicaoExistencia(int a, int b, int c) {
        return Math.abs(b - c) < a && a < b + c;
    }

    @Override
    public double semiPerimeter(){
        return (getLadoA() + getLadoB() + getLadoC()) / 2;
    }

    @Override
    public double calculateArea(){
        int s = semiPerimeter();
        int area = s *(s - getLadoA())*(s -getLadoB())*(s -getLadoC());
        return Math.sqrt(area);
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        if (condicaoExistencia(ladoA, getLadoB(), getLadoC())) {
            this.ladoA = ladoA;
        }
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        if (condicaoExistencia(getLadoA(), ladoB, getLadoC())) {
            this.ladoB = ladoB;
        }
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        if (condicaoExistencia(ladoA, ladoB, ladoC)) {
            this.ladoC = ladoC;
        }
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", ladoC=" + ladoC +
                '}';
    }
}

