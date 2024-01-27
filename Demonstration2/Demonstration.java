package Demonstration2;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Demonstration extends Applet{
    public void init(){
        // Changing background color to YELLOW
        setBackground(Color.YELLOW);
    }

    public void paint(Graphics g){
        g.drawString("Applet background Example", 0, 50);
    }
}
/*
 * <applet code="Demonstration.class" width="300" height="300"></applet>
 */