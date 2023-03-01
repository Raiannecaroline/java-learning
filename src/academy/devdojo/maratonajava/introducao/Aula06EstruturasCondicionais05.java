package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasCondicionais05 {

    public static void main(String[] args) {
        /**
         * Imprima um dia da semana, considerando domingo o primeiro dia.
         */
        Scanner entrada = new Scanner(System.in);
        byte dia;

        System.out.println("Digite o dia de 1 a 7: ");
        dia = entrada.nextByte();

        /**
         * Tipos de váriaveis no Switch: char, int, byte, short, enum e String;
         */
        switch (dia){
            default:
                System.out.println("Opção invalida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        Scanner entrada2 = new Scanner(System.in);
        String sexo;

        System.out.println("Escolha o Sexo entre 'M' e 'F': ");
        sexo = entrada2.next();

        switch (sexo){
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção Inválida");
        }

    }

}
