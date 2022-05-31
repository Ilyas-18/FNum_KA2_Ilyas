import javax.swing.*;
import java.awt.*;

public class MyFrame extends javax.swing.JFrame {


    public MyFrame() {
        GFG3ANE frame = new GFG3ANE();
        frame.setTitle("Funktionszeichner");
        frame.setPreferredSize(new Dimension(1200,900));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setContentPane(new GFG3ANE().getPanelMain());
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
