package ReplitTasks;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum = scan.nextInt();

        System.out.println("Enter second number:");
        int secondNum = scan.nextInt();

        System.out.println("Enter first number:");
        int thirdNum = scan.nextInt();
        int middleNumber = 0;
        if (firstNum > secondNum && firstNum > thirdNum) {
            if (secondNum > thirdNum) {
                middleNumber = secondNum;
            } else {
                middleNumber = thirdNum;
            }
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            if (firstNum > thirdNum) {
                middleNumber = firstNum;
            } else {
                middleNumber = thirdNum;
            }
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            if (firstNum > secondNum) {
                middleNumber = firstNum;
            } else {
                middleNumber = secondNum;
            }
        }

        System.out.println("middle number is: " + middleNumber);

    }

}
/*

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
n topics: if statements, primitive variables, operators, Scanner
**Example Flows:**
``
Enter first number:
14
Enter second number:
52
Enter third number:
25

middle number is: 25
```
```

Enter first number:
140
Enter second number:
34
Enter third number:
1
middle number is: 34
```
 */