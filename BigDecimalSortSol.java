import java.math.BigDecimal;
import java.util.*;
class BigDecimalSortSol{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        String na[]= new String[n];
        for(int i=0;i<na.length;i++)
        na[i]=s[i];
        //Write your code here
Arrays.sort(na,Collections.reverseOrder(new Comparator<String> (){
    //@Overrirde
    public int compare(String a1, String a2){
        BigDecimal a= new BigDecimal(a1);
        BigDecimal b= new BigDecimal(a2);
        return a.compareTo(b);
    }
}));
s=na;
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
