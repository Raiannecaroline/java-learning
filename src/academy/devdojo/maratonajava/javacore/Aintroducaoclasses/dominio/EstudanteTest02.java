package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "All Might";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Midoriya";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        //Dentro do Objeto -> (This) Pegar esse nome, idade e sexo.
        // Variável de Classe
        estudante01.imprime();
        estudante02.imprime();

    }
}
