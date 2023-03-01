package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "All Might";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Midoriya";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        //Primeira referência
        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("************************************");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
