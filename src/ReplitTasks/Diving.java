package ReplitTasks;

import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

// min and max değerişkenleri varsayım değer atadık.
        float max = score[0];
        float min = Float.MAX_VALUE;
        float sum = 0;
        float total = 0;
        float difficult ;
//inorder to print enter score part created a loop
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();

 // to find max - min and some in the same loop
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
            sum += score[i];
        }
        sum = sum - max - min;
        System.out.println("Enter the difficulty rating:");
        difficult = input.nextFloat();
        total = (float) (sum * difficult * 0.6);
        System.out.println("Final score: " +total);
        input.close();
    }
}
/*
### Create a program for the diving contest to determine the diver's score based on multiple factors. There will be a total of seven judge scores.
 From the scores the highest and lowest will be discarded and the remaining `five will be added together`.
 That sum will then be multiplied by a difficulty rating ranging from `1.2` to `3.8`.
 In the end the final score will be determined by multiplying the value by `0.6`

#### Create the program with this flow:
> - Ask for the seven judges' scores using the following message and store the scores into an `int []`
    - `Enter score for judge 1:`
    - `Enter score for judge 2:`
    - etc for all seven judges
> - Ask for the difficulty rating. `Range of 1.2 - 3.8`
    - `Enter the difficulty rating:`
> - Finish the calculation by multiply the value by `0.6` and print the total score:
    - `Final Score: $score`

Main topics: arrays, primitive datatypes, index, operators, loops, counter, Scanner

Example Flow:
```
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter the difficulty rating:
2.1
Final Score: 35.28
```
 */