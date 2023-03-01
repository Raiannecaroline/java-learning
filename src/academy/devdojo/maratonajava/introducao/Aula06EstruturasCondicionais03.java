package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais03 {
    public static void main(String[] args) {

        /**
         * Doar se salário > 5000;
         */
        double salario = 3000;
        /**
         * IF Ternário - IF de terno
         * (condicao) ? verdadeiro : falso;
         */
        String resultado = salario > 5000
                ? "Eu vou doar 500 para o Dev Dojo"
                : "Ainda não tenho condições, mas terei!";

        System.out.println(resultado);

    }

}
