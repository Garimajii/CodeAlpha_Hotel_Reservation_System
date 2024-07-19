package mypack;

import java.util.Date;

public class Reservation {
    private String guestName;
    private Room room;
    private int arrivalDate;
    private int departureDate;

    public Reservation(String guestName, Room room, int arrivalDate, int departureDate) {
        this.guestName = guestName;
        this.room = room;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public Room getRoom() {
        return room;
    }

    public int getArrivalDate() {
        return arrivalDate;
    }

    public int getDepartureDate() {
        return departureDate;
    }
}
