package Aula3;

import java.util.Scanner;
public class TiposPrimitivos {
     public static void main (String[] args) {
          Scanner scanner = new Scanner(System.in);

          /*

          System.out.println("Digite o nome do aluno: ");
          String nome = scanner.nextLine();
          System.out.println("Digite a nota do aluno: ");
          float nota = scanner.nextFloat();


         System.out.format("A nota de %s é %.1f \n ", nome , nota);

         */

          /*

          int idade = 30;
          String valor = Integer.toString((idade));
          System.out.println(valor);




         String nome = "Isaque";
        float nota = 8.5f;


          System.out.println("A nota é "+ nota);
          System.out.printf("A nota de %s é %.2f \n",nome,nota);
          System.out.format("A nota de %s é %.1f \n",nome,nota);

          */
          String valor = "30";
          int idade = Integer.parseInt(valor);
          System.out.println(idade);



     }
}
