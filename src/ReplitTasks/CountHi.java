package ReplitTasks;

import java.util.Scanner;

public class CountHi {

    public static void main(String[] args) {
//DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int count = 0;
        String hi = "hi";
        hi=hi.toLowerCase();
        for (int i = 0; i <= str.length() - 2; i++) {
            String eachHi = str.substring(i, i + 2);
            if (eachHi.equals(hi)) {
                count++;
            }

        }
        System.out.println(count);

    }

}
/*
### Use a `loop` to count how many times the characters `hi` are found in the given String `str`. Only consider the lowercase characters for `hi`.

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    abc hi how

  Output:
    1
 */