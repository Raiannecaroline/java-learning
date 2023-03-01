package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Raiane";
        funcionario.idade = 29;
        funcionario.salarios = new double[]{3000, 600, 9000};

        funcionario.imprimeDados();

    }
}
