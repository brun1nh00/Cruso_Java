package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class operadora {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int minutos;
        double valor;

        System.out.println("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();

        if (minutos <= 100) {
            valor = 50.00;
        }
        else {
            valor = (((minutos - 100) * 2) + 50);
        }

        System.out.printf("Valor a pagar: R$ %.2f", valor);
    }
}
