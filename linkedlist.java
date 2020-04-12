import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        LinkedList<Integer> list= new LinkedList<>();
        for(int i=0;i<l;i++){
        list.add(sc.nextInt());
        }
        int n=sc.nextInt();
        while(n!=0){
            String s=sc.next();
            if(s.equals("Insert")){
                int index=sc.nextInt();
                int el= sc.nextInt();
                list.add(index,el);
            }
            else{
                int r=sc.nextInt();
                list.remove(r);
            }
            n--;
        }
        for(Integer no:list)
        System.out.print(no+ " ");
    }
}

