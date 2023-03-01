package academy.devdojo.maratonajava.introducao;

public class Aula05OperadoresLogicos {

    public static void main(String[] args) {

        /**
         * Operadores de resto = %
         *
         */

        int number1 = 10;
        int number2 = 15;

        if (number1 == number2){
            System.out.println("Os números são iguais");
        } else{
            System.out.println("Os números são diferentes");
        }

        int par = 2;
        int impar = 3;

        if (par % 2 == 0){
            System.out.println("O número é par ");
        } else{
            System.out.println("O número é impar ");
        }

        /**
         * Operadores de maior (>) e menor (<) -
         * menor igual (<=) e maior igual (>=)
         * diferente de (!=)
         * igual a (==)
         */

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezIgualADez " + isDezIgualADez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);

        /**
         * Operadores lógicos - and (&&) - or (||) - not (!);
         */

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorDoQueTrinta =  idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorDoQueTrinta " + isDentroDaLeiMenorDoQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlayStation = 5000;

        boolean isPlayStation5Compravel = valorTotalContaCorrente > valorPlayStation
                || valorTotalContaPoupança > valorPlayStation;
        System.out.println("isPlayStation5Compravel " + isPlayStation5Compravel);


        /**
         * Operadores de Atribuição (=) (-=) (+=) (/=) (%=) (*=)
         */
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus %= 2;
        System.out.println(bonus);

        /**
         * Operadores (++) - (--)
         */
        int contador = 0;
        contador += 1;
        contador++; //Primeiro executa e depois incrementa
        contador--; // Primeiro executa e depois desencrementa
        ++contador; //Primeiro incrementa e depois executa
        --contador; //Primeiro desencrementa e depois executa
        System.out.println(contador);

        int contador2 = 0; // primeiro executar o que fazer e depois fazer algo
        System.out.println(contador2++);

    }

}
