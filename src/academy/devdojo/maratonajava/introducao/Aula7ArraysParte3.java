package academy.devdojo.maratonajava.introducao;

public class Aula7ArraysParte3 {
    public static void main(String[] args) {
        /**
         * Array não pode aumentar dinâmicamente
         */

        String[] nomes = new String[4];

        nomes[0] = "Raiane";
        nomes[1] = "Emanoel";
        nomes[2] = "Elvis";
        nomes[3] = "Uendia";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
