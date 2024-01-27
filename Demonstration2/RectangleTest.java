package Demonstration2;
import java.applet.Applet;
import java.awt.Graphics;
public class RectangleTest extends Applet { // use of init() method to pass value through HTML to applet
    int x, y, w, h;
    public void init(){
        x = Integer.parseInt(getParameter("xValue"));
        y = Integer.parseInt(getParameter("yValue"));
        w = Integer.parseInt(getParameter("wValue"));
        h = Integer.parseInt(getParameter("hValue"));
    }
    public void paint(Graphics g){
        g.drawRect(x, y, w, h);
    }
}
/*
 * <applet code="RectangleTest.class" width="150" height="150">
 * <param name ="xValue" value="20">
 * <param name ="yValue" value="40">
 * <param name ="wValue" value="100">
 * <param name ="hValue" value="50">
 */
