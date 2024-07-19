package mypack;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BookingSystem {
    private Hotel hotel;
    private PaymentProceesing paymentProcessor;

    public BookingSystem() {
        hotel = new Hotel();
        paymentProcessor = new PaymentProceesing();
    }

    public void searchRooms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room category: ");
        String category = scanner.nextLine();
        List<Room> results = hotel.searchRooms(category);
        // display search results
    }

    public void bookRoom() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();
        Room room = hotel.getRoom(roomNumber);
        if (room != null && room.isAvailable()) {
            System.out.print("Enter guest name: ");
            String guestName = scanner.nextLine();
            System.out.print("Enter arrival date (yyyy-MM-dd): ");
            int arrivalDate = scanner.nextInt();
            System.out.print("Enter departure date (yyyy-MM-dd): ");
            int departureDate = scanner.nextInt();
            Reservation reservation = new Reservation(guestName, room, arrivalDate, departureDate);
            paymentProcessor.processPayment(reservation);
            room.setAvailable(false);
            System.out.println("Booking confirmed!");
        } else {
            System.out.println("Room not available");
        }
    }

    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.searchRooms();
        bookingSystem.bookRoom();
    }
}

