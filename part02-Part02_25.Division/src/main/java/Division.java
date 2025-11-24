

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        System.out.println(division(3, 5));
    }

    // implement the method here
    public static double division(int a, int b){
        double res = (double)a/b;
        System.out.println(res);
        return res;
    }
}
