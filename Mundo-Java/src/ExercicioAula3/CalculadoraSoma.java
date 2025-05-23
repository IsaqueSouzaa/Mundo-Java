package ExercicioAula3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSoma {
    public static void main(String[] args){

        JFrame frame = new JFrame("Calculadora de Soma");
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setSize(300,200);

        frame.setLayout(new GridLayout(4,2,10,10));

        JLabel label1 = new JLabel("Numero 1");
        JTextField campo1 = new JTextField();

        JLabel label2 = new JLabel("Numero 2");

        JTextField campo2 = new JTextField();

        JButton somar = new JButton("Somar");
        JLabel resultado = new JLabel("Resultado: ");

        frame.add(label1);
        frame.add(campo1);

        frame.add(label2);
        frame.add(campo2);

        frame.add(somar);
        frame.add(new JLabel());

        frame.add(resultado);
        frame.add(new JLabel());

        somar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              try{

                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt((campo2.getText()));
                int soma = num1 + num2;
                resultado.setText("Resultado: " + soma);
            }catch (NumberFormatException ex){
                  resultado.setText("Digite numeros validos");
              }
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
