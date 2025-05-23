package Aula3;

public class OperadoresLogicos {
    public static void main(String[] args){
        /*

        Operador Ternario
        int n1, n2 , r;
        n1 = 10;
        n2 = 8;
        r = (n1 > n2)? n1 + n2: n1 - n2;
        System.out.println(r);

         */

        String nome1 = "Alucard";
        String nome2 = "Alucard";
        String nome3 = new String ("Alucard");
        String resultado;
        resultado = (nome1.equals(nome3))? "Igual":"Diferente";
        System.out.println(resultado);


    }
}
