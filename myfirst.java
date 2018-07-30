import java.util.*;

public class myfirst{
    public static void main(String args[]) {
        System.out.println("Hi maksi");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        if (first == 1)  
            System.out.println("first = 1");
        if (first == 2) 
            if (second == 2) 
                System.out.println("first and second = 2");
        int summ = first + second;
        System.out.println(first+"+"+second+"="+summ);
        int i;
        for(i = 0; i < 10; i++) {
            System.out.println("i = "+i);
        }
    }
}

