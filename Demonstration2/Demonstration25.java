package Demonstration2;
import java.applet.Applet;
// import java.awt.Color;
import java.awt.Graphics;
public class Demonstration25 extends Applet { // passing paramter through HTML to applet
    public void paint(Graphics g){
        int  x  = 0;
        int  y = 0;
        String msg = "";
        x = Integer.parseInt(getParameter("xPosition"));
        y = Integer.parseInt(getParameter("yPosition"));
        msg = getParameter("msg");

        g.drawString(msg, x, y);
    }
}
/*
 * <html>
 *          <title>Applet parameter Example</title>
 *          <hr>
 *       <applet code="Demonstration25.class" width="300" heights="300">
 *          <param name="xPosition" value="50"/>
 *          <param name="yPosition" value="50"/>
 *          <param name="msg" value="This is a parameter example program"/>
 *       </applet>
 *          <hr>
 * 
 * </html>
 */
