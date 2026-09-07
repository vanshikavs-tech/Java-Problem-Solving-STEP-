package Week-6.PRACTICPROBLEMS;

class IdCard {

    String name;
    int booksIssued;

    // Constructor
    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        // First object
        IdCard ravi =
            new IdCard("Ravi", 0);

        // Same object
        IdCard duplicate = ravi;

        // Modify through second reference
        duplicate.booksIssued = 3;

        // Separate object
        IdCard separate =
            new IdCard("Ravi", 3);

        System.out.println(
            "Ravi's booksIssued (via first variable): "
            + ravi.booksIssued
        );

        System.out.println(
            "duplicate == ravi: "
            + (duplicate == ravi)
        );

        System.out.println(
            "separate == ravi: "
            + (separate == ravi)
        );
    }
}