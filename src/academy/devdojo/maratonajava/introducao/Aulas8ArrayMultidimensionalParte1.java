package academy.devdojo.maratonajava.introducao;

public class Aulas8ArrayMultidimensionalParte1 {
    public static void main(String[] args) {
        /**
         * Meses: 1,2,3,4,5
         * Dias: 31,28,31,30,31
         */
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 3;

       for (int i = 0; i < dias.length; i++){
           for (int j = 0; j < dias[i].length; j++){
               System.out.println(dias[i][j]);
           }
       }
    }
}
