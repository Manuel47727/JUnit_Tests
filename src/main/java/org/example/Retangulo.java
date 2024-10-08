package org.example;

public class Retangulo {

    public int area (int base, int altura) {
        return base * altura;
    }

    public int perimetro (int base, int altura) {
        return (base+altura) * 2;
    }

    public boolean isTriangle(int ladoA, int ladoB, int ladoC) {
        return (ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB);
    }
}
