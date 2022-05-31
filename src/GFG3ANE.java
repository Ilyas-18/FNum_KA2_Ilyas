import javax.swing.*;
import java.awt.*;

public class GFG3ANE  extends javax.swing.JFrame {

    private JPanel panelMain;
    private JButton buttonDraw;
    private JButton buttonEnd;
    private JPanel buttonPanel;
    private JTextField txtFa;
    private JTextField txtFb;
    private JTextField txtFc;
    private JTextField txtFd;

    public JPanel getPanelMain() {
        return panelMain;
    }

    private Font f1 = new Font("Tahoma", Font.BOLD, 12);
    private Font fGraph = new Font("New Times Roman", Font.PLAIN, 5);
    private int sizeX;
    private int sizeY;
    private boolean jButtonbuttonDrawIsSelected;
    public double a;

    public void paint(Graphics g) {
        /* unverfälschte Methode paintComponent() aufrufen, um nicht Funktionalität zu verlieren,
         sonst z.B. Hindergrund weiss*/
        super.paintComponents(g);

        // zum variieren der Breite und Höhe
        sizeX = this.getWidth();
        sizeY = this.getHeight();

        // oben links soll Funktion stehen
        g.setColor(Color.black);
        g.setFont(f1);
        g.drawString("f(x) = " + txtFa.getText() + "x³ + " + txtFb.getText() + "x² + " + txtFc.getText() + "x + " + txtFd.getText(), 50, 55);

        // Koordinatenkreuz zeichnen
        g.setColor(Color.black);
        g.drawLine(10, sizeY / 2 + 20, sizeX, sizeY / 2 + 20); //x-Achse: Warum nicht sizeY/2
        g.drawLine(sizeX / 2, 40, sizeX / 2, sizeY); //y-Achse

        // Beschriftung der Achsen
        g.setFont(f1);
        g.drawString("x", sizeX - 20, sizeY / 2 + 20); //Bezeichnung
        for (int i = -10; i <= 10; i++) {
            if (i != 0) {
                // sizeX/12 = 50 --> alle 50 Pixel
                g.drawString("|" + i, sizeX / 2 + i * sizeX / 12, sizeY / 2 + 10 + 20);
            }
        }

        g.drawString("y", sizeX / 2 + 15, 50); //Bezeichnung
        for (int i = 10; i >= -10; i--) {
            if (i != 0) {
                // sizeX/12 = 50 --> alle 50 Pixel
                g.drawString("-" + i, sizeX / 2, ((-i * sizeX / 12) + sizeY / 2 + 20));
            }
        }

        // Der Graph einer Funktion wird gezeichnet
        if (buttonDraw.isSelected()) {
        g.setFont(fGraph);
        for (double x = -5; x <= 5; x = x + 0.001) {
            double y = x * x - 1;
            g.drawString(".", sizeX / 2 + (int) (x * sizeX / 12), sizeY / 2 + 20 - (int) (y * sizeX / 12));
         }
        }
    }
        public void setjButtonbuttonDrawIsSelected(boolean jButtonbuttonDrawIsSelected) {
            this.jButtonbuttonDrawIsSelected = jButtonbuttonDrawIsSelected;
        }

    public GFG3ANE(){
        buttonDraw.addActionListener(e -> setjButtonbuttonDrawIsSelected(jButtonbuttonDrawIsSelected));
    }
}
