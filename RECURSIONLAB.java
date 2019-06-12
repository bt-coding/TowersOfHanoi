public class RECURSIONLAB {
    public static int GCD(int x, int y) {
        if (y==0) 
            return x;
        else 
            return GCD(y, x%y);
    }
    public static int sumDownBy2(int n) {
        if (n<=0) 
            return 0;
        else 
            return sumDownBy2((n-2))+n;
    }
    public static long factorial(int n) {
        if (n<=0)
            return 1;
        else
            return factorial(n-1)*n;
    }
    public static long recpower(int x, int n) {
        if (n<=0) 
            return 1;
        else
            return x*recpower(x,n-1);   
    }
}