package ReplitTasks;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size: ");//13.3, 15.0, 17.3
        double screenSize = scan.nextDouble();
        int totalPrice = 0;
        int screenPrice = 0;
        if (screenSize == 13.3) {
            screenPrice = 200;
        } else if (screenSize == 15.0) {
            screenPrice = 300;
        } else {
            screenPrice = 400;
        }
        totalPrice += screenPrice;

        scan.nextLine();
        System.out.println("Select CPU type: ");//i3, i5, i7
        String cpuType = scan.nextLine();
        int cpuPrice = 0;
        if (cpuType.equals("i3")) {
            cpuPrice = 150;
        } else if (cpuType.equals("i5")) {
            cpuPrice = 250;
        } else {
            cpuPrice = 350;
        }
        totalPrice += cpuPrice;

        System.out.println("Select RAM size: ");//must be divisible by (4)
        int ram = scan.nextInt();
        int division = ram / 4;
        totalPrice += (division * 50);

        System.out.println("Select storage type: ");//HDD, SSD
        String storageType = scan.next();

        System.out.println("Select storage size: ");
        int storageSize = scan.nextInt();

        if (storageType.equals("HDD")) {
            totalPrice += (storageSize / 500) * 50;
        }
        if (storageType.equals("SSD")) {
            totalPrice += (storageSize / 500) * 100;
        }

        System.out.println("Select screen resolution: ");//FULLHD, 4K
        String scrResolution = scan.next();
        if (scrResolution.equals("FULLHD")) {
            totalPrice += 100;
        }
        if (scrResolution.equals("4K")) {
            totalPrice += 200;
        }
        double finalPrice = totalPrice;

        System.out.println("Final Price is: $" + finalPrice);
    }

    /*
    ### Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:

**First ask the user about the screen size**
> Select screen size:
> - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price

**Then ask the user about the CPU**
> Select CPU type:
> - For a CPU of `i3`, add `$150` to the total price
> - For a CPU of `i5`, add `$250` to the total price
> - For a CPU of `i7`, add `$350` to the total price

**Then ask the user about the RAM size**
> Select RAM size:
> - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

**Then ask the user about the storage type and amount**
> Select storage type:

> Select storage size:

> - For `HDD`, add `$50` to the total price for every 500GB
> - For `SSD`, add `$100` to the total price for every 500GB

**Then ask the user about the screen resolution**
> Select screen resolution:
> - For `FULLHD`, add `$100` to the total price
> - For `4K`, add `$200` to the total price

** At the end display the total price of the custom computer**
> Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0
```

```
  Select screen size:
    13.3
  Select CPU type:
    i3
  Select RAM size:
    4
  Select storage type:
    HDD
  Select storage size:
    500
  Select screen resolution:
    FULLHD
  Final price is: $550.0
     */
}
