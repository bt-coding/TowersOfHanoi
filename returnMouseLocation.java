import java.awt.*;
public class returnMouseLocation {
    public static void main(String[] args) {
        while(true) {
            System.out.println(MouseInfo.getPointerInfo().getLocation().x + " - " + MouseInfo.getPointerInfo().getLocation().y); ; 
        }
    }
}