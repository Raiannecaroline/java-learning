package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);

        double result2 = calculadora.divideDoisNumerosPart2(20, 0);
        System.out.println(result2);

        System.out.println("_______________________________");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
