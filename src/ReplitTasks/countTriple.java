package ReplitTasks;

import java.util.Scanner;

public class countTriple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        int count=0;
        String triple="";

        for (int i = 0; i <= str.length()-3; i++) {
            triple=str.substring(i,i+3);

            if(triple.charAt(0)==triple.charAt(1) && triple.charAt(1)==triple.charAt(2))
                count++;
        }
        System.out.println(count);
    }
}

