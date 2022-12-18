package ReplitTasks;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = "";
        String lastName = "";
        String domain = "";

//veli_kara@gmail.com
//012345678 112345678
        firstName = email.substring(0, email.indexOf("_"));
        lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));

        firstName= (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();
        domain=(""+domain.charAt(0)).toUpperCase()+domain.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);
    }
}
/*
### Use `String methods` to divide the given `email` into separate parts. The email will always be in this format:

#### firstName_lastName@domain.com

Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format - The first letter of each word is uppercase and the rest are lowercase. Output in the following format:

```
First name: $first name
Last name: $last name
Domain: $domain
```

#### Hint: Think about how to use substring and indexOf together

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    jeff_bezos@amazon.us

  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon
```
```
Ex:
  Input:
    sergey_brin@gmail.com

  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
```

 */
