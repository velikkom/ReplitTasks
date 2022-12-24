package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:
        String [] sentence1 = sentence.split(" ");
        String reverse="";
        for (int i = sentence1.length - 1; i >= 0; i--) {
            reverse+=sentence1[i]+" ";
        }
        reverse=reverse.substring(0,reverse.length()-1);
        System.out.println(reverse);
    }
}


/*
### Given a `String` `sentence` print a version with the words reversed. The order of the words is changed, not the letters.

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, concatenation, index, primitive dataypes

Example:
```
Input:
  Java is fun

Output:
  fun is Java
```

Example:
```
Input:
  Hello! How are you?

Output:
  you? are How Hello!
```
 */