package ReplitTasks;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {

        //WRITE YOUR CODE BELOW
        Scanner input = new Scanner(System.in);
        //WRITE YOUR CODE BELOW
        String guestList = "";

        System.out.println("Please enter the guest's name:");
        String name = input.nextLine();
        guestList += name;

        System.out.println("Do you want to enter another guest's name?");
        String answer = input.nextLine().toLowerCase();


        while (answer.equals("yes")) {
            System.out.println("Please enter the guest's name:");
            String name2 = input.nextLine();
            System.out.println("Do you want to enter another guest's name?");
            answer = input.nextLine().toLowerCase();
            guestList += ", " + name2;
            if (answer.equals("no")) {
                input.close();
            }
        }
        System.out.println("Guests' list: " + guestList);

    }
}

/*
### Use a `loop` to create a guest list for the party.
Ask the user to enter the name of the first guest,
store the name into the guest list and ask if they want to enter another guest name.

> - If the user says `yes` then ask them for the next guest's name and repeat the process
> - If the user says `no` then stop asking for names and display the final guest list

Main topics: loops, Scanner, Strings, concatenation

Example Flows:
```
Please enter the guest's name:
  Nick
Do you want to enter another guest's name?
  yes
Please enter the guest's name:
  Linda
Do you want to enter another guest's name?
  no
Guests' list: Nick, Linda
```
 */