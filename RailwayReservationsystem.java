import javax.swing.JOptionPane;

public class RailwayReservationsystem {

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Enter Username:");
        String password = JOptionPane.showInputDialog("Enter Password:");

        if(username.equals("admin") && password.equals("admin")) {

            JOptionPane.showMessageDialog(null,
                    "Login Successful!");

            String name = JOptionPane.showInputDialog("Passenger Name:");
            String trainNo = JOptionPane.showInputDialog("Train Number:");
            String trainName = JOptionPane.showInputDialog("Train Name:");
            String source = JOptionPane.showInputDialog("From:");
            String destination = JOptionPane.showInputDialog("To:");

            JOptionPane.showMessageDialog(null,
                    "Reservation Successful!\n\n" +
                    "Passenger: " + name +
                    "\nTrain No: " + trainNo +
                    "\nTrain Name: " + trainName +
                    "\nFrom: " + source +
                    "\nTo: " + destination);

            String pnr = JOptionPane.showInputDialog(
                    "Enter PNR Number to Cancel Ticket:");

            JOptionPane.showMessageDialog(null,
                    "Ticket Cancelled Successfully!\nPNR: " + pnr);

        } else {

            JOptionPane.showMessageDialog(null,
                    "Invalid Login!");
        }
    }
}

