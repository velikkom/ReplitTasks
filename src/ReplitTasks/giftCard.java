package ReplitTasks;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        System.out.println("List of items, with prices, available in the store:\n" +
                "> - Blanket: $60\n" +
                "> - Charger: $5\n" +
                "> - Hat: $25\n" +
                "> - Headphones: $30\n" +
                "> - Laptop: $200\n" +
                "> - Pants: $50\n" +
                "> - Pillow: $40\n" +
                "> - Smartphone: $1000\n" +
                "> - Socks: $5\n" +
                "> - USB cable: $10");
        String item = scan.next();
        int price = 0;
        int giftCardBalance = 100;
        int balance =100;
        switch (item) {
            case "Blanket":
                price = 60;
                break;
            case "Charger":
            case "Socks":
                price = 5;
                break;
            case "Hat":
                price = 25;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Laptop":
                price = 200;
                break;
            case "Pants":
                price = 50;
                break;
            case "Pillow":
                price = 40;
                break;
            case "Smartphone":
                price = 1000;
                break;
            case "USB cable":
                price =10;
                break;

            default:
                System.out.println("Sorry, that is an invalid item");

        }
    if (price>giftCardBalance){
        System.out.println("Sorry, not enough funds on your gift card");
    }else
        System.out.println("Thank you for your purchase!\n" +
                "Your current balance is: "+(giftCardBalance-price));
    }

}

        /*
        ### You got a $100 gift card for your birthday, but we can't use it yet.
        We need to build the application for the store in order to use our gift card.

#### The program will ask the user to enter the item they want to buy.
Then it will check if that item is in the store inventory.
If the item is available there will be a confirmation message displayed and the remaining balance on the gift card will be output as well.
In some cases that item may not be available in the store and in other cases we may not have enough money on the gift card to buy an item
So we must handle both of these conditions as well. We can only make one purchase at a time.

** **



- If the item is not in the list, display message: `Sorry, that is an invalid item`
- If the price of the item we want is more than $100, display message: `Sorry, not enough funds on your gift card`

#### Hint: Use a switch statement to avoid having to compare String values in if statements. Don't forget to create your Scanner object.

Main topics: switch statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Hello, which item would you like?
  Hat
  Thank you for your purchase!
  Your current balance is: 75$
```

```
  Hello, which item would you like?
  Pants
  Thank you for your purchase!
  Your current balance is: 50$
```

```
  Hello, which item would you like?
  Laptop
  Sorry, not enough funds on your gift card
```

```
  Hello, which item would you like?
  Cupcake
  Sorry, that is an invalid item
```
         */



