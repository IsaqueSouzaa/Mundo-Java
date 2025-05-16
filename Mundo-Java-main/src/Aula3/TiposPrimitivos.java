package Aula3;

import java.util.Scanner;


public class TiposPrimitivos {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

        /*
         String nome = "Isaque";
        float nota = 8.5f;
        */

        System.out.println("A nota é "+ nota);
        System.out.printf("A nota de %s é %.2f \n",nome,nota);
        System.out.format("A nota de %s é %.1f \n",nome,nota);

    }
}
