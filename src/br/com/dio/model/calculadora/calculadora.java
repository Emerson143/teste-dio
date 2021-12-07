package br.com.dio.model.calculadora;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


        int a, b;

        System.out.println("Digite o primeiro valor =");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor = ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Subtração:" + subtrair);
        System.out.println("Multiplicar:" + multiplicar);
        System.out.println("Dividir:" + dividir);


        }

    private static int dividir(int a, int b) {
        return a / b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static int subtrair(int a, int b) {
        return a - b;
    }

    private static int somar(int a, int b) {
        return a +b;
    }
}