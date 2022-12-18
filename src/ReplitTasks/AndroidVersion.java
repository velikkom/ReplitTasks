package ReplitTasks;

import java.util.Scanner;

public class AndroidVersion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String version = input.nextLine();


        //double version = input.nextDouble();

        if (version.equals("1.5")) {
            System.out.println("Cupcake");
        } else if (version.equals("1.6")) {
            System.out.println("Donut");
        } else if (version.equals("2.1")) {
            System.out.println("Eclair");
        } else if (version.equals("2.2")) {
            System.out.println("Froyo");
        } else if (version.equals("2.3")) {
            System.out.println("Gingerbread");
        } else if (version.equals("3.1")) {
            System.out.println("Honeycomb");
        } else if (version.equals("4.0")) {
            System.out.println("Ice Cream Sandwich");
        } else if (version.equals("4.1")) {
            System.out.println("Jelly Bean");
        } else if (version.equals("4.4")) {
            System.out.println("KitKat");
        } else if (version.equals("5.0")) {
            System.out.println("Lollipop");
        } else if (version.equals("8.0")) {
            System.out.println("Oreo");
        } else if (version.equals("9.0")) {
            System.out.println("Pie");
        } else {
            System.out.println("Not a valid version");
        }


        input.close();
    }
}
/*
**Versions**
> - 1.5 -
> - 1.6 -
> - 2.1 -
> - 2.2 -
> - 2.3 -
> - 3.1 -
> - 4.0 -
> - 4.1 -
> - 4.4 -
> - 5.0 -
> - 8.0 -
> - 9.0 -
> - Any other number is invalid and should display:

 */