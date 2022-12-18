package ReplitTasks;

import java.util.Scanner;

public class VehicleRepair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        switch (vehicleYear) {
            case 1995:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 1996:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 1997:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 1998:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2001:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2002:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2004:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2005:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2006:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2015:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2016:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2017:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            default:
                System.out.println("Your vehicle is fine, enjoy!");
                break;


        }
    }
}

/*
 > - 1995-1998,
 > - 2001-2002,
 > - 2004-2006,
 > - 2015-2017

### Given the `vehicleYear` determine if the vehicle is being recalled or not

> If the year is from included in the recall year list print:
  `Your vehicle needs to be recalled!`

> If the year is not one of the recall years print:
`Your vehicle is fine, enjoy!`

Main topics: if statements, primitive variables, operators

**Example Flows:**
```
Enter vehicle's year:
1996

Your vehicle needs to be recalled!
```
```
Enter vehicle's year:
2002

Your vehicle needs to be recalled!
```
```
Enter vehicle's year:
2018

Your vehicle is fine, enjoy!
```


 */