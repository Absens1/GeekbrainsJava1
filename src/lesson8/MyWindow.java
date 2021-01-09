package lesson8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow(){

        setSize(800, 600);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout southGridLayout = new GridLayout(1,2);
        GridLayout northGridLayout = new GridLayout(1,2);

        JPanel southPanel = new JPanel(southGridLayout);
        JPanel northPanel = new JPanel(northGridLayout);

        southPanel.add(new MyButton().exit());

        southPanel.add(new MyButton().showMsg("Test msg"));

        Color[] colors = new Color[]{Color.BLACK, Color.RED, Color.BLUE, Color.CYAN, Color.LIGHT_GRAY,
                Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.WHITE};

        for(int i = 0; i < colors.length; i++) {
            northPanel.add(new MyButton().recolorBack(this, colors[i])).setBackground(colors[i]);
        }

        add(southPanel, BorderLayout.SOUTH);

        add(northPanel, BorderLayout.NORTH);

        setVisible(true);
    }
}
