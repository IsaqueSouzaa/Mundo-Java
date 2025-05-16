package Exercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class InterfaceIdioma {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Idioma do Sistema");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS));

        JLabel idioma = new JLabel("Idioma do Sistema", SwingConstants.CENTER);
        idioma.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JButton botao = new JButton("Mostrar Idioma!");
        botao.setAlignmentX(JButton.CENTER_ALIGNMENT);


        JLabel idiomaSistema = new JLabel(" ", SwingConstants.CENTER);
        idiomaSistema.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale idiomaDoSistema = Locale.getDefault();
                String texto = "<html>" +
                        "Idioma: " + idiomaDoSistema.getLanguage() + "<br>" +
                        "País: " + idiomaDoSistema.getCountry() + "<br>" +
                        "Nome do Idioma: " + idiomaDoSistema.getDisplayLanguage() + "<br>" +
                        "Nome do País: " + idiomaDoSistema.getDisplayCountry() +
                        "</html>";
                idiomaSistema.setText(texto);
            }
        });

        janela.add(Box.createVerticalStrut(20));
        janela.add(idioma);
        janela.add(Box.createVerticalStrut(20));
        janela.add(botao);
        janela.add(Box.createVerticalStrut(20));
        janela.add(idiomaSistema);
        janela.add(Box.createVerticalStrut(20));

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}