import java.util.*;

// --- Q1: Student List ---
class EmptyStudentListException extends Exception {
    public EmptyStudentListException(String msg) { super(msg); }
}

class StudentList {
    private List<String> students = new ArrayList<>();
    void add(String name) { students.add(name); System.out.println(name + " added."); }
    void remove(String name) { 
        if(students.remove(name)) System.out.println(name + " removed.");
        else System.out.println(name + " not found."); 
    }
    void display() {
        try {
            if(students.isEmpty()) throw new EmptyStudentListException("Student list is empty!");
            List<String> sorted = new ArrayList<>(students); Collections.sort(sorted);
            System.out.println("Sorted: " + sorted);
        } catch(Exception e) { System.out.println(e.getMessage()); }
    }
}

// --- Q3: Number List ---
class NumberList {
    private List<Integer> numbers = new ArrayList<>();
    void add(String input) {
        try { numbers.add(Integer.parseInt(input.trim())); System.out.println(input + " added."); }
        catch(Exception e){ System.out.println("Invalid input!"); }
    }
    void avg() {
        try {
            if(numbers.isEmpty()) throw new ArithmeticException("Cannot calculate average!");
            double sum=0; for(int n:numbers) sum+=n;
            System.out.println("Average: " + (sum/numbers.size()));
        } catch(Exception e){ System.out.println(e.getMessage()); }
    }
}

// --- Main Menu ---
public class MenuDriven {
    static Scanner sc = new Scanner(System.in);
    static StudentList sl = new StudentList();
    static NumberList nl = new NumberList();

    public static void main(String[] args){
        int choice;
        do {
            System.out.println("\n1.Add Student 2.Remove Student 3.Display Students 4.Add Number 5.Calculate Average 6.Exit");
            System.out.print("Choice: "); choice = getInt();
            switch(choice){
                case 1 -> { System.out.print("Name: "); sl.add(sc.nextLine()); }
                case 2 -> { System.out.print("Name: "); sl.remove(sc.nextLine()); }
                case 3 -> sl.display();
                case 4 -> { System.out.print("Number: "); nl.add(sc.nextLine()); }
                case 5 -> nl.avg();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while(choice!=6);
    }

    static int getInt() {
        try { return Integer.parseInt(sc.nextLine().trim()); }
        catch(Exception e){ return -1; }
    }
}
