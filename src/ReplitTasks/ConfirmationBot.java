package ReplitTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConfirmationBot {
    public static void main(String[] args) {
/*
 if the response is `y` print the message: `Your request is being processed`
> - if the response is `n` print the message: ``
> - if the response is `h` print the message: `Sorry, no live agents are currently available`
> - if the response is anything other than `y, n, or h` print: `Invalid entry, please try again`*/
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE BELOW
        if (response == 'y' || response == 'n' || response == 'h') {
            switch (response) {
                case 'y':
                    System.out.println("Your request is being processed");
                    break;
                case 'n':
                    System.out.println("Thank you for your consideration");
                    break;

                case 'h':
                    System.out.println("Sorry, no live agents are currently available");
                    break;
            }

        }else {
            System.out.println("print: `Invalid entry, please try again");
        }



/*
Main topics: switch statements, primitive variables

** Example Flows:**
```
Ex:
  Enter command:
  y
  Your request is being processed
```
```
Ex:
  Enter command:
  a
  Invalid entry, please try again
```
```
Ex:
  Enter command:
  n
  Thank you for your consideration
```
 */


    }
}
