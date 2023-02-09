# Movie Ticket
A Java project that simulates a movie ticket.

# Description
This project contains a class called Bilet that represents a movie ticket with the following information:

nazwa_filmu: Name of the movie.
data: Date of the movie.
godzina: Hour of the movie.
rzad: Row number.
miejsce: Seat number.
cena: Ticket price.
The class contains the following methods:

checkMiejsce: This method checks if the row and seat numbers are within the allowed range (1 to 15 for rows and 1 to 10 for seats).
Bilet: This is the constructor that initializes the ticket information. It calls checkMiejsce to validate the row and seat numbers. If the numbers are not valid, it prints an error message.
Drukuj: This method prints the ticket information.
ZmienMiejsce: This method changes the row and seat numbers of the ticket. It calls checkMiejsce to validate the new numbers. If the numbers are not valid, it prints an error message.
The project also contains a class called Main that creates a random ticket and prints its information. It also changes the ticket's row and seat numbers.

# Usage
To run the project, compile and run the Main class. The program will generate a random movie ticket and print its information. Then, it will change the ticket's row and seat numbers and print the updated information.