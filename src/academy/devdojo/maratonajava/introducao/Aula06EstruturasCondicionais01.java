package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais01 {

    public static void main(String[] args) {

        int idade = 15;
        boolean isAtorizadoAComprarBebida = idade >= 18;


        if(isAtorizadoAComprarBebida != false){
            System.out.println("Pode beber cachaça!! ");
        } else{
            System.out.println("Não pode beber cachaça!! ");
        }

        if (!isAtorizadoAComprarBebida){
            System.out.println("Não pode beber cachaça!! ");
        }

    }

}
