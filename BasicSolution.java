import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class BasicSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        BigInteger a= sc.nextBigInteger();
        BigInteger b= sc.nextBigInteger();
        BigInteger c=a.add(b);
        BigInteger d=a.multiply(b);
        System.out.println(c);
        System.out.println(d);
    }
}
