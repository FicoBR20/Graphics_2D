package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Canvas extends JPanel {

    private String text;

    private Font font;

    private int step =1;

    public Canvas(){

        this.setBackground( new Color(66, 67, 71));
        text = "Drawing with Graphics";
        font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 27);

    }

    void drawParts(){
        step++;
        System.out.println(" step:" + String.valueOf(step));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // super es el constructor de la clase que hereda en este caso JPanel

        g.setFont(font);

        switch (step){
            case 1://texto
                g.setColor(new Color(0x97BFE2));
                g.drawString(text, 150,24);
                break;
            case 2://linew
                g.setColor(new Color(0x97BFE2));
                g.drawString("Lines Second", 150,24);
                g.setColor(new Color(0xA622D2));
                g.drawLine(50  ,40, 200,40);
                g.drawLine(50  ,40, 300,60);
                break;
            case 3://Rectangles
                g.setColor(new Color(0x97BFE2));
                g.drawString("Rectangles",150,24);
                g.setColor(new Color(0xA23752));
                g.drawRect(100,30,300,40);
                g.setColor(new Color(0x9B8424));
                g.fillRect(100, 65, 300,    40);
                g.setColor(new Color(0x81B11C));
                g.fillRect(100,130,100,100);
                g.drawRoundRect(250,130,100,100, 50,100);
                break;
            case 4://Oval
                g.setColor(new Color(0x97BFE2));
                g.drawString("Ovals", 150,24);
                g.setColor(new Color(0x123D9B));
                g.drawOval(20, 30, 100, 100);
                g.fillOval(20, 150, 100, 100); break;
            case 5://image
                g.setColor(new Color(0x97BFE2));
                g.drawString("Images", 150,24);
                ImageIcon imageIcon = new ImageIcon("/Users/federicobarbetti/Documents/UV_fils/__Programacion Orientada a Eventos/Proyectos_POE/Graphics_2D/src/Resources/River.png");
                g.drawImage(imageIcon.getImage(), 50,30, 500,500,null);
                break;
            default://end
                g.setColor(new Color(0x97BFE2));
                g.drawString("Nothing to do", 150,24);
                g.setColor(new Color(0xE7EBEF));
                g.drawString("END", 150,80);
                break; // nada sigue.
        }
    }


}
