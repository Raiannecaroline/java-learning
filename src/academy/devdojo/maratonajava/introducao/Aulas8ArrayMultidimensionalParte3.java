package academy.devdojo.maratonajava.introducao;

public class Aulas8ArrayMultidimensionalParte3 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = arrays;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n____________________");

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
