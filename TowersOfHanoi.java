//USE http://www.coolmath-games.com/0-tower-of-hanoi

import cs1.*;

public class TowersOfHanoi
{
    public static final int wait = 2;
    public static void main(String[] args) 
    {
        while(true) {
            System.out.print("Enter number of discs: ");
            int discs = Keyboard.readInt();
            Hanoi h = new Hanoi(1380,735,1540,735,1690,735);
            solve(discs, "A", "B", "C",h);
        }
    }//END MAIN
    private static void solve(int n, String start, String auxiliary, String end, Hanoi h) 
    {
        if (n == 1) 
        {
            System.out.println(start + " -> " + end);
            try {
                Thread.sleep(wait);
            } catch (Exception e) {
            }            
            if (start.equals("A")) {
                h.moveA();
            } else if (start.equals("B")) {
                h.moveB();
            } else if (start.equals("C")) {
                h.moveC();
            }
            try {
                Thread.sleep(wait); 
            } catch (Exception e) {
            }
            h.click();
            if (end.equals("A")) {
                h.moveA();
            } else if (end.equals("B")) {
                h.moveB();
            } else if (end.equals("C")) {
                h.moveC();
            }
            try {
                Thread.sleep(wait);
            } catch (Exception e) {
            }            
            h.click();            
        } 
        else 
        {
            solve(n - 1, start, end, auxiliary,h);
            System.out.println(start + " -> " + end);
            try {
                Thread.sleep(wait);
            } catch (Exception e) {
            }            
            if (start.equals("A")) {
                h.moveA();
            } else if (start.equals("B")) {
                h.moveB();
            } else if (start.equals("C")) {
                h.moveC();
            }
            try {
                Thread.sleep(wait);
            } catch (Exception e) {
            }
            h.click();
            if (end.equals("A")) {
                h.moveA();
            } else if (end.equals("B")) {
                h.moveB();
            } else if (end.equals("C")) {
                h.moveC();
            }
            try {
                Thread.sleep(wait);
            } catch (Exception e) {
            }            
            h.click();            
            solve(n - 1, auxiliary, start, end,h);
        }
    }//END SOLVE
}    