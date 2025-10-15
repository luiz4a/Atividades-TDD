package com.example.calculadora;    

public final class Calculadora {

    private Calculadora() {}

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nao e possivel dividir por zero");
        }
        return a / b;
    }
}

