import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n=== STUDENT GRADE TRACKER ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Summary");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    students.add(new Student(name, marks));
                    System.out.println("Student added.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student data available.");
                        break;
                    }

                    int total = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

                    for (Student s : students) {
                        total += s.marks;
                        max = Math.max(max, s.marks);
                        min = Math.min(min, s.marks);
                    }

                    double avg = (double) total / students.size();

                    System.out.println("\n--- SUMMARY ---");
                    System.out.println("Total Students: " + students.size());
                    System.out.println("Average Marks: " + avg);
                    System.out.println("Highest Marks: " + max);
                    System.out.println("Lowest Marks: " + min);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

