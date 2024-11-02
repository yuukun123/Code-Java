package School_test_datxecongnghe;

import java.util.*;

public class Driver extends User {
    private List<Ride> listRidesHistory;
    private boolean isAvailable;


    public Driver(String userID, String userName, String password, String phoneNumber, String address, String email, String role) {
        super(userID, userName, password, phoneNumber, address, email,"Driver");
        listRidesHistory = new ArrayList<>();
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
        System.out.println("Tai xe " + getUserName() + " đã cập nhật trạng thái: " + (available ? "Sẵn sàng" : "Bận"));
        System.out.println();
    }

    public void acceptRide(Ride ride) {
        if(isAvailable) {
            ride.setStatus("Accepted");
            ride.setDriver(this);
            listRidesHistory.add(ride);
            this.isAvailable = false;
            System.out.println("Ride accepted successfully");
            System.out.println();
        } else {
            System.out.println("Ride already accepted");
            System.out.println();
        }
    }

    public void showDriverInfo() {
        System.out.println("Driver ID: " + getUserID());
        System.out.println("Driver Name: " + getUserName());
        System.out.println("Driver Phone Number: " + getPhoneNumber());
        System.out.println("Driver Address: " + getAddress());
        System.out.println("Driver Email: " + getEmail());
        System.out.println();
    }

}