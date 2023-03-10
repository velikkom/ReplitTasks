package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class NonDuplicate {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //WRITE YOUR CODE BELOW:
        for (int j = 0; j < nums.length; j++) {
            int each = nums[j];
            int frequency = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == each) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(each);
                break;

            }

        }


    }
}
     /*
### Given an `int []` `nums` that has duplicate numbers,
 which means each numbers is found twice in the array.
 Find and print the non-duplicate number,
 which mean the ones that does not have two occurrences of it.
 If there is more than one, return the first unique in array!

Main topics: arrays, primitive datatypes, index, operators, loops, if statements, counter

Example:
```
Input:
  [1, 2, 3, 4, 3, 4, 1]
   1  2  3  4  3  4  1
Output:
  2
```

```
Input:
  [6, 44, 6, 4, 3, 4, 1]

Output:
  44 (more than one unique number. but 44 is the first)
```

 */