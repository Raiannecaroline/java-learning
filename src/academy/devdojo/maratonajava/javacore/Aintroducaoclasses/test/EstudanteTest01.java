package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        /**
         * Variável do tipo referência do tipo Estudante
         * Objeto do tipo Estudante
         */
        Estudante estudante = new Estudante();
        /**
         * Atributos são as características do meu estudante;
         */
        estudante.nome = "Goku";
        estudante.idade = 30;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
