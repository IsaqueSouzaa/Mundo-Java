package Aula3;

import java.util.Scanner;

public class TesteTipos {
    public static void main(String[] args){


        Scanner teclado = new Scanner(System.in);
        /*
        System.out.print("Digite a idade: ");
        int idade = teclado.nextInt();
        String valor = Integer.toString(idade);

        System.out.println(valor);
        */
        System.out.print("Digite um valor");
        String valor = teclado.nextLine();
        float idade = Float.parseFloat(valor);
        System.out.printf("%.1f", idade );



    }
}
