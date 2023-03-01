package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        System.out.println("------------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


        // Depois de imprimir o método ele vai alterar
        // Pois depois de imprimir os métodos, ele vai chamar novamente a referência
        // O estudante está alterando o estado do objeto e o estado vai ficar alterado
        // Quando você altera algo no objeto, você está mantendo essa alteração para as outras referências
        estudante.nome = "Gohan";

    }
}
