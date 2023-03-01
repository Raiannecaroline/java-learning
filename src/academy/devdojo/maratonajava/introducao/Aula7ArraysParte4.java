package academy.devdojo.maratonajava.introducao;

public class Aula7ArraysParte4 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        //Formas de se fazer um array
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

        //For de indice
//        for(int i = 0; i < numeros3.length; i++){
//            System.out.println(numeros3[i]);
//        }

        //For sem indice
        for (int num: numeros3) {
            System.out.println(num);
        }
    }
}
