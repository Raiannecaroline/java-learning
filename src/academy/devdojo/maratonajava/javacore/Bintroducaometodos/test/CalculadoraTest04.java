package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int nume1 = 1;
        int nume2 = 2;

        calculadora.alteraDoisNumeros(nume1, nume2);
        System.out.println("Dentro do Teste 04");
        System.out.println("Nume1 " + nume1);
        System.out.println("Nume2 " + nume2);
    }
}
