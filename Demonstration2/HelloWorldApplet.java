package Demonstration2;
import java.applet.Applet;
import java.awt.Graphics;
public class HelloWorldApplet extends Applet { // Basic applet program
    public void paint(Graphics g){
        g.drawString("Hello World", 150, 150);
    }
}
