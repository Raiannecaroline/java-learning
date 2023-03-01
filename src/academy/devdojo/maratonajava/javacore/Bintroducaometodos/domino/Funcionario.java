package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null){
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial, " + media);
    }

}
