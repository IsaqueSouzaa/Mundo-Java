package Exercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceResolucao {
    public static void main(String[] args){

        JFrame janela = new JFrame("Resolução da Tela");
        janela.setSize(400,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BoxLayout(janela.getContentPane(),BoxLayout.Y_AXIS));

        JLabel resolucao = new JLabel("Resolução de Tela", SwingConstants.CENTER);
        resolucao.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JButton botao = new JButton("Mostrar Resolução");
        botao.setAlignmentX(JButton.CENTER_ALIGNMENT);

        JLabel resolucaoTela = new JLabel("Resoluçao: ??? x ???",SwingConstants.CENTER);
        resolucaoTela.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();

               int altura = tamanhoTela.height;
               int largura = tamanhoTela.width;
               resolucaoTela.setText("Resolução: " + altura + " X " + largura);




            }
        });

        janela.add(Box.createVerticalStrut(20));
        janela.add(resolucao);
        janela.add(Box.createVerticalStrut(20));
        janela.add(botao);
        janela.add(Box.createVerticalStrut(20));
        janela.add(resolucaoTela);

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

    }
}
