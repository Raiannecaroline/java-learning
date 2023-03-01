package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domino;

public class Calculadora {

    public void somaDosNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int numero1, int numero2){
        System.out.println(numero1 * numero2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public double divideDoisNumerosPart2(double numero1, double numero2){
        if (numero2 == 0){
            return 0;
        } else{
            return numero1 / numero2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double n1, double n2){
        if (n2 == 0){
            System.out.println("Não existe número divisível por 0 ");
            return;
        }
        System.out.println(n1 / n2);
    }

    public void alteraDoisNumeros(int nume1, int nume2){
        nume1 = 99;
        nume2 = 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("Nume1 " + nume1);
        System.out.println("Nume2 " + nume2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVargs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
