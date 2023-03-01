package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais10 {
    /**
     * Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
     * Condição que o valorDaParcela => 1000
     * @param args
     */
    public static void main(String[] args) {

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }
}
