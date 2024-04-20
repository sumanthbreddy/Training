2. Ticket Pricing:
You are designing a ticket pricing program for a movie theater. The program should prompt the user for their age and the type of movie they want to watch (e.g., "regular" or "3D"). Based on the age and movie type, the program should calculate and output the ticket price according to the following rules:
Regular Movie:
Age < 18: $8
Age >= 18: $12
3D Movie:
Age < 18: $10
Age >= 18: $15


CODE:-

import java.util.Scanner;

public class TicketPricing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the type of movie (regular/3D): 1 for regular 2 for 3D ");
        int  movie= scanner.nextInt();

        int ticketPrice = 0;

        if (movie==1) {
            if (age < 18) {
                ticketPrice = 8;
            } else {
                ticketPrice = 12;
            }
        } else if (movie==2) {
            if (age < 18) {
                ticketPrice = 10;
            } else {
                ticketPrice = 15;
            }
        } else {
            System.out.println("Invalid movie type. Please enter 'regular' or '3D'.");
            
        }

        System.out.println("$" + ticketPrice);
    }
}
