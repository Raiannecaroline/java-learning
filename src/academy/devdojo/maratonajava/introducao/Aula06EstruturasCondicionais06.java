package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasCondicionais06 {
    public static void main(String[] args) {
        /**
         * Dados os valores de 1 a 7,
         * imprima se é dia útil ou fim de semana,
         * considerando o domingo como 1
         */

        Scanner entrada = new Scanner(System.in);
        byte dia;

        System.out.println("Digite o dia de 1 a 7: ");
        dia = entrada.nextByte();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Opção Inválida");
        }

    }
}
