package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {

    static int ddd;

    protected JButton exitButton = new JButton("Выход");
    protected JButton showMsgButton = new JButton("Сообщение");
    protected JButton recolorButton = new JButton();

    public MyButton(){
        exitButton.setPreferredSize(new Dimension(130,100));
        recolorButton.setPreferredSize(new Dimension(50,50));
    }


    public JButton exit(){

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        return exitButton;
    }

    public JButton showMsg(String msg){

        showMsgButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, msg);
            }
        });

        return showMsgButton;
    }

    public JButton recolorBack(JFrame jFrame, Color color){

        recolorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().setBackground(color);
            }
        });

        return recolorButton;
    }
}
