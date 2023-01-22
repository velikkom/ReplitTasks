package ReplitTasks;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)){
                result  += each;

            }
        }

        return result;
    }
}






/*
### Finish the method called `uniqueChars()` that will take a `String` `str` argument and
returns a `String` that will only have a unique copy of each character.
Remove the duplicate instances of each character. T
he `uniqueChars()` method is already called in the main method with an argument.

#### This is a `return` method with a `String` parameter

Main topics: methods, Scanner, String, loops

Example:
```
  uniqueChars("java")

output:
  jav
```
Example:
```
  uniqueChars("mama")

output:
  ma
```
Example:
```
  uniqueChars("spoon")

output:
  spon
```
 */