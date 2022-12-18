package ReplitTasks;

import java.util.Scanner;

public class HourMinutes {
    public static void main(String[] args) {
        int hour = 0;
        int minute =0;
        int second =0;
        String amOrPm ="";

        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();

        System.out.println(hour+":"+minute+":"+second+" :"+amOrPm);
//12:24:33 PM
    }
}
