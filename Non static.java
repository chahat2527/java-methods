//class 1
//Helper class
public class Helper {
    // Non-static method
    public static int sum(int a, int b) {
        // simply returning the sum
        return a + b;
    }
}

// class 2
// CAC class
public class CAC {
    public static void main("String [] args")
    {
        //imput integer of sum
        int m=9, n=8;
        // creating above method
        Helper c=new helper();
        //calling above method
        int s=g.sum(n,m);
        //sum of integer
        System.out.println("sum is " + s);
    }
}