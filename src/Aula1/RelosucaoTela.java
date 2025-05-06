package Aula1;

import java.awt.*;

public class RelosucaoTela {
    public static void main(String[] args) {

        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();

        int largura = tamanhoTela.width;
        int altura = tamanhoTela.height;

        System.out.print("Resolução da tela: " + altura + " X " + largura);
    }
}
