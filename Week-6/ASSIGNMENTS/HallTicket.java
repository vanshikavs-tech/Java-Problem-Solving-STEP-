package Week-6.PRACTICPROBLEMS;

class HallTicket {

    String studentName;
    int seatNumber;

    // Constructor
    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {

        // First object
        HallTicket priya =
            new HallTicket("Priya", 0);

        // Second variable refers to the SAME object
        HallTicket copy = priya;

        // Change through second reference
        copy.seatNumber = 45;

        // Third variable refers to a NEW object
        HallTicket separate =
            new HallTicket("Priya", 45);

        System.out.println(
            "Priya's seatNumber (via first variable):"
        );
        System.out.println(priya.seatNumber);

        System.out.println("copy == priya: " + (copy == priya));
        System.out.println(
            "separate == priya: " + (separate == priya)
        );
    }
}