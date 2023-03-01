package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carro01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("----------------------------------------------------");

        carro1.nome = "Troller";
        carro1.modelo = "Troller T4 - 4X4";
        carro1.ano = 2001;

        System.out.println("Nome do carro: " + carro1.nome + "; Modelo do carro: " + carro1.modelo + "; Ano do carro: " + carro1.ano);

        System.out.println("----------------------------------------------------");

        carro2.nome = "Pajero";
        carro2.modelo = "Pajero TR4 - 4X4";
        carro2.ano = 2013;

        System.out.println("Nome do carro: " + carro2.nome + "; Modelo do carro: " + carro2.modelo + "; Ano do carro: " + carro2.ano);


    }

}
