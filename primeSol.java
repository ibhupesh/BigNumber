import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class primeSol {



    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = sc.nextBigInteger();
        if(n.isProbablePrime(1)==true)
        System.out.println("prime");
        else
        System.out.println("Not Prime");
    }
}

