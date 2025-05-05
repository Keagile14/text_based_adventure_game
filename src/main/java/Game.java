import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    Font titlefont = new Font("Times New Roman", Font.PLAIN,80);


    public static void main(String[] args){

        new Game();
    }
    public Game(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100,600,150);
        titleNamePanel.setBackground(Color.BLACK);

        // FIX: Initialize before adding
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titlefont);
        titleNamePanel.add(titleNameLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.WHITE);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

}


