package ExercicioAula2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class InterfaceData {
    public static void main(String[] args){

        JFrame janela = new JFrame("Data do sistema");
        janela.setSize(400,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS)); 

        JLabel data = new JLabel("Data e Hora Atual do Sistema" , SwingConstants.CENTER);
        data.setAlignmentX(JLabel.CENTER_ALIGNMENT); 

        JButton botao = new JButton("Clique Aqui");
        botao.setAlignmentX(JButton.CENTER_ALIGNMENT);

        JLabel dataAtual = new JLabel("", SwingConstants.CENTER);
        dataAtual.setAlignmentX(JLabel.CENTER_ALIGNMENT);


        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date data = new Date();
                dataAtual.setText(data.toString());
            }
        });
        janela.add(Box.createVerticalStrut(20));
        janela.add(data);
        janela.add(Box.createVerticalStrut(20));
        janela.add(botao);
        janela.add(Box.createVerticalStrut(20));
        janela.add(dataAtual);

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}
