import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true){
        System.out.println("Digite um número binário (ou 'sair'): ");
        String bin =sc.nextLine();

        if(bin.equalsIgnoreCase("sair")){
            System.out.println("Encerrando . . .");
            break;
        }
        if (bin.length() > 8){
            System.out.println("Erro: máximo de 8 dígitos!");
            continue;
        }

        int decimal= 0;
        int tamanho = bin.length();
        boolean valido= true;

        for (int i = 0; i < tamanho; i++){
            char digito = bin.charAt(i);

            if (digito != '0' && digito != '1'){
                System.out.println("Erro apenas 0 e 1! ");
                valido = false ;
                break;
            }
            int potencia = tamanho -1 -i;
            decimal += (digito - '0' * (int)Math.pow(2,potencia));
        }
        if(valido){
            System.out.println("Decimal: " + decimal);
        }
        System.out.println();


    }



    }

}
