package Demonstration2;
import java.applet.Applet;
import java.awt.Graphics;
public class HelloWorld extends Applet { // Applet with init() and resize() method
    public void init(){
        resize(200, 200);
    }
    public void paint(Graphics g){
        g.drawString("Hello World", 150, 150);
    }
}
/*
 *  <applet code="HelloWorld.class" width="300" height="300"></applet>
 */