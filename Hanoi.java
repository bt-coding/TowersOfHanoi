import java.awt.*;
import java.awt.event.*;
public class Hanoi {
    private int ax;
    private int ay;
    private int bx;
    private int by;
    private int cx;
    private int cy;
    private Robot rb;
    public Hanoi(int axx, int ayy, int bxx, int byy, int cxx, int cyy) {
        ax = axx;
        ay = ayy;
        bx = bxx;
        by = byy;
        cx = cxx;
        cy = cyy;
        try {
            rb = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void moveA() {
        rb.mouseMove(ax, ay);        
    }
    public void moveB() {
        rb.mouseMove(bx, by);          
    }
    public void moveC() {
        rb.mouseMove(cx, cy);          
    }
    public void click() {
        rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        try {
            Thread.sleep(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}