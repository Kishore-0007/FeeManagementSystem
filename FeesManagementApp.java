import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double totalFeesPaid;
    private double totalFeesDue;

    public Student(int id, String name, double totalFeesPaid, double totalFeesDue) {
        this.id = id;
        this.name = name;
        this.totalFeesPaid = totalFeesPaid;
        this.totalFeesDue = totalFeesDue;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTotalFeesPaid() {
        return totalFeesPaid;
    }

    public double getTotalFeesDue() {
        return totalFeesDue;
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            totalFeesPaid += amount;
            totalFeesDue -= amount;
            System.out.println("Payment of Rs. " + amount + " received from " + name);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + id + "\nName: " + name + "\nTotal Fees Paid: Rs. " + totalFeesPaid
                + "\nTotal Fees Due: Rs. " + totalFeesDue;
    }
}

class FeesManagementSystem {
    private List<Student> students;

    public FeesManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}

public class FeesManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FeesManagementSystem system = new FeesManagementSystem();

        while (true) {
            System.out.println("FEES MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. Make Payment");
            System.out.println("3. View Student Details");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Total Fees Paid: ");
                    double totalFeesPaid = sc.nextDouble();
                    System.out.print("Enter Total Fees Due: ");
                    double totalFeesDue = sc.nextDouble();
                    Student student = new Student(id, name, totalFeesPaid, totalFeesDue);
                    system.addStudent(student);
                    System.out.println("Student added successfully.\n");
                    break;
                case 2:
                    System.out.print("Enter Student ID for payment: ");
                    int paymentId = sc.nextInt();
                    Student paymentStudent = system.findStudentById(paymentId);
                    if (paymentStudent != null) {
                        System.out.print("Enter Payment Amount: ");
                        double paymentAmount = sc.nextDouble();
                        paymentStudent.makePayment(paymentAmount);
                    } else {
                        System.out.println("STUDENT NOT FOUND!\n");
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to view details: ");
                    int viewId = sc.nextInt();
                    Student viewStudent = system.findStudentById(viewId);
                    if (viewStudent != null) {
                        System.out.println(viewStudent);
                    } else {
                        System.out.println("STUDENT NOT FOUND!\n");
                    }
                    break;
                case 4:
                    System.out.println("\nThank you for using our service.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice. Enter a valid option.");
            }
        }
    }
}