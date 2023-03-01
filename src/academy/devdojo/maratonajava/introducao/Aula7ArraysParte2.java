package academy.devdojo.maratonajava.introducao;

public class Aula7ArraysParte2 {
    public static void main(String[] args) {

        /**
         * Variável Primitiva ou de classe - Tipo Array
         * Byte, shor, int, long, float e double = 0
         * Char '\u0000' = ''
         * boolean = false
         * String = null
         *
         * Arrays serão sempre objetos, sendo primitivos ou não.
         * Quando tá trabalhando com tipos primitivos, não pode usar o new com array
         */

        String[] nomes = new String[3];

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
    }
}
