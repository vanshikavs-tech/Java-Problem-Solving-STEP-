package Week-6.PRACTICPROBLEMS;

class CompanyEmployee {

    // Instance fields
    String empName;
    double salary;

    // Static fields
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Constructor
    CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    // Static method
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        CompanyEmployee e1 =
            new CompanyEmployee("Amit", 50000);

        CompanyEmployee e2 =
            new CompanyEmployee("Priya", 60000);

        CompanyEmployee e3 =
            new CompanyEmployee("Rahul", 55000);

        CompanyEmployee.printCompanyInfo();
    }
}