package ReplitTasks;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
        int size = word.length();
        // System.out.println(size);
        if (size < 5) {
            System.out.println("Too short!");
        } else if (size == 5) {
            String reverse = "";
            for (int i = word.length(); i > 0; i--) {
                reverse += word.charAt(i - 1);
            }
            System.out.println(reverse);
        } else {
            System.out.println("Too long!");
        }


    }
}
/*if(size>5)
### Use `String methods` and `if statements` to reverse a String that is five characters long.
If the given `word` is not five characters long, it will not be reversed. Use the following to output a value:

> - If the `word` is less than 5 characters: print `Too short!`
> - If the `word` is more than 5 characters: print `Too long!`
> - If the `word` is 5 characters: print the `reversed version` of the String. Reading characters from the end to the beginning.


Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    cat

  Output:
    Too short!
```
 */