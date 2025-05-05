import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window;
    Container con;
    public static void main(String[] args){

        new Game();
    }
    public Game(){
        window = new JFrame();
        window.setSize(800,600); //decides how large window is
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //It adds a function to the window
        window.getContentPane().setBackground(Color.PINK); //we just set the colour
        window.setLayout(null);
        window.setVisible(true); //even though window was created in this program, you cannot see. We need to make it appear on the screen
        con = window.getContentPane();
    }
}


