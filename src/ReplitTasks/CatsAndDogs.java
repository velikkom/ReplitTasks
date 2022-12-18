package ReplitTasks;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        System.out.println("Please enter the word");
        Scanner scan = new Scanner(System.in);
         String s = scan.nextLine();

        int countCat =0;
        int countDog= 0;

        while (s.contains("cat") || s.contains("dog")) {
            if ( s.contains("cat")) {
                s= s.replaceFirst("cat", "");
                countCat++;
            }
            if (s.contains("dog")) {
                s=s.replaceFirst("dog","");
                countDog++;

            }
        }
        boolean equal= true;
        if (countDog==countCat){
            equal=true;
        }else {
            equal=false;
        }
        System.out.println("equal = " + equal);
        scan.close();
    }
}