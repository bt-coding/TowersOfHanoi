import cs1.*;

public class SumTester
{
    //Will return the sum of the first n-integers (n>=1)
    //Iterative solution (loop)
    public static int sumIterative(int n)
    {
        int total = 0;
        
        for (int x=1; x<=n; x++)
            total += x;
            
        return total;

    }//END METHOD
    
    //Will return the sum of the first n-integers (n>=1)
    //Recursive solution
    public static int sumRecursive(int n)
    {
        if (n==1)
            return 1;
        else
            return n + sumRecursive(n-1);
        
    }//END METHOD
    
    public static void main(String[] args) {
        System.out.println("Enter your n: ");
        int num = Keyboard.readInt();
        
        long startTime = System.nanoTime();
        System.out.println(sumIterative(num));
        long endTime = System.nanoTime();
        System.out.println("Iterative took " + (endTime-startTime) + " nanoseconds");
        startTime = System.nanoTime();
        System.out.println(sumRecursive(num));
        endTime = System.nanoTime();
        System.out.println("Recursive took " + (endTime-startTime) + " nanoseconds");        
        System.out.println();
        int bestint = 0;
        double prevbest = 100000;
        double beststart = 0;
        double bestend = 0;
        long istartTime;
        long iendTime;
        long rstartTime;
        long rendTime;
        long itime;
        long rtime;
        for(int i=0; i<5000; i++) {
            istartTime = System.nanoTime();
            System.out.println(sumIterative(num));
            iendTime = System.nanoTime();
            System.out.println("Iterative took " + (endTime-startTime) + " nanoseconds");
            itime = endTime-startTime;
            System.out.println();
            rstartTime = System.nanoTime();
            System.out.println(sumRecursive(num));
            rendTime = System.nanoTime();
            System.out.println("Recursive took " + (endTime-startTime) + " nanoseconds");  
            rtime = endTime-startTime;
            if (Math.abs(rtime-itime) < prevbest) {
                bestint = i;
                prevbest = endTime-startTime;
                beststart = startTime;
                bestend = endTime;
                
            }
            
            
        }
        System.out.println("Very close at " + bestint);
        System.out.println("Time: " + prevbest);
        System.out.println("start: " + beststart);
        System.out.println("end: " + bestend);
        
        
        
    }
    
   
    
    
    
}//END CLASS
