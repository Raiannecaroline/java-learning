package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais07 {
    public static void main(String[] args) {
        /**
         * Estruturas - while, do while e for
         */

        //while
        int count = 0;
        while(count <= 10){
            System.out.println(count);
            count = count + 1;
        }

        //do while
        do{
            System.out.println("Dentro do do-while" + ++count);
        }while(count < 10);

        //For
        for(int i = 0; i <= 10; i++){
            System.out.println("For" + i);
        }

    }
}
