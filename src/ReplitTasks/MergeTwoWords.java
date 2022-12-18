package ReplitTasks;

import java.util.Scanner;

public class MergeTwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int size1 = word1.length();
        int size2 = word2.length();

        if (size1 == 3 && size2 == 3) {
            System.out.println("" + word1.charAt(0) + word2.charAt(0) + word1.charAt(1) + word2.charAt(1) + word1.charAt(2) + word2.charAt(2));
        } else {
            System.out.println("cannot merge");
        }

    }
}
/*
### Use `String methods` and `if statements` to  combine the two given String variables, `word1` and `word2` together,
but only combine them if the Strings are only three character long.
If either String is not three characters long, do not merge them together and instead print `cannot merge`. If both Strings are three characters long then merge them together in the following format and print the merged String:

#### The Strings will be merged by taking the first character of the first word, then the first character of the second word, then the second character of the first word, etc...

#### Hint: Concatenating any type with a String, converts the type to a String

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    aok
    lol

  Output:
    alookl
```
 */