package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        String[] str1 = str.split(", ");
        //System.out.println(Arrays.toString(str1));
        int minumum = str1[0].length();
        //System.out.println(minumum);
        //find the shortest word
        for (String s : str1) {
            if (s.length() < minumum) {
                minumum = s.length();
            }
        }
        //count how many shortest word we have
        int count = 0;
        for (String each : str1)
            if (each.length() == minumum) {
                count++;
            }
        //add shortest words to the array its size must be the count
        String[] result = new String[count];
        int index = 0;
        for (String each : str1) {
            if (each.length()==minumum){
                result[index]=each;
                index++;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
/*
### Given a `String` `str`, find and print the shortest words.
The `String` will have multiple words separated by commas and spaces.
If there is words that have the same length,
they should all be displayed at the end.
Print all the shortest words in the following format:

> Input: word1, word2, word3, word4, etc...

> Output: [short1, short2, short3, etc...]

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, loops, if statements, primitive datatypes, operators

Example:
```
Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

Output:
  [old, cat, ray]
 */