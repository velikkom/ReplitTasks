package ReplitTasks;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW
        String str = "";
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                str +=word.charAt(i);
            }
        }
        System.out.println(str);
    }
}
/*
Use a `loop` to print each vowel( a, e, i, o, u) from the given `word`

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    howdyho

  Output:
    oo
```
```
Ex:
  Input:
    java

  Output:
    aa
```
```
Ex:
  Input:
    apple

  Output:
    ae
```
 */