package ReplitTasks;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();
        String result="";

        if (age < 3) {
            result=("ineligible");
        } else if (age >= 3 || age <= 4) {
            result=("preschool");
        } else if (age == 5) {
            result=("kindergarten");
        } else if (age >= 6 || age <= 10) {
            result=("elementary school");
        } else if (age >= 11 || age <= 13) {
            result=("middle school");
        } else if (age >= 14 || age <= 18) {
            result=("high school");
        } else {
            result=("college");
        }
        System.out.println(result);
        input.close();
    }
}
/*
### Use `if statements` to help the student find out which grade level they will join based on their `age`.
Use the following information to determine the results:

```
less than 3   ->
3-4           ->
5             ->
6-10          ->
11-13         ->
14-18         ->
19+           ->
```

#### Hint: Use a multi branch if statement

Main topics: if statements, primitive variables, operators

```
Ex:
  Input:
    8

  Output:
    elementary
```
```
Ex:
  Input:
    5

  Output:
    kindergarten
```
 */