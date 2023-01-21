package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class WordCount {
    public static int wordCount(String words) {
        // your code
        String newWord = " ";
        int count = 0;

        while (words.contains(newWord)) {
            words = words.replaceFirst(newWord, "");
            count++;
        }
        return count+1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));

    }
}
/*
### Finish the method called `wordCount()` that will take a `String` `words` argument and return an `int`
for the number of words in the given `words` variable. The words are seperated by a space.
 The `wordCount()` method is already called in the main method with an argument.

#### This is a `return` method with a `String` parameter

Main topics: methods, Scanner, String, loops

Example:
```
  wordCount("one two three")

output:
  3
```
Example:
```
  wordCount("foo bar")

output:
  2
```
 */