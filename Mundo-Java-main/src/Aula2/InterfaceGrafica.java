package Aula2;

// importamos todas as interfaçes graficas como Jframe, Jbuttton, Jlabel e JOptionPane
import javax.swing.*;
// Representa um evento de clique ou ação
import java.awt.event.ActionEvent;
// interface usada para ouvir eventos, como um clique
import java.awt.event.ActionListener;

public class InterfaceGrafica {
    public static void main(String[] args){
// Criamos uma janela de app e damos um titulo
        JFrame janela = new JFrame("Minha primeira Janela");
//Definimos o tamanho da janela
        janela.setSize(400,300);
// Definimos uma ação para quando o usario clicar no X da janela. "EXIT_ON_CLOSE" faz o programa encessar completamente.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Definimos que todos os componentes seram posicionados manualmente
        janela.setLayout(null);
// Criamos um texto que será exibido, "SwingConstants.CENTER" posiciona o exto no centro do Label
        JLabel label = new JLabel("Olá mundo Swing!", SwingConstants.CENTER);
// Definimos o posicionamento do texto, altura e largura
        label.setBounds(80, 20, 240, 30);
// Criamo um botão
        JButton botao = new JButton("Clique Aqui");
        botao.setBounds(130, 100, 130, 30);
//"addActionListener" adiciona um ouvinte de eventos ao botão
        botao.addActionListener(new ActionListener() {
            @Override
// Usamos o metodo esse metodo para quando o botão for clicado
            public void actionPerformed(ActionEvent e) {
// Usamos esse comando para criamos um popup para exibir um texto
                JOptionPane.showMessageDialog(null, "Primeiro Evento");

            }
        });
// Adiconamos o botão e mensagem na janela
        janela.add(label);
        janela.add(botao);
// Centralizamos a janela no centro da tela do computador e tornamos ela visivel
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

    }
}
