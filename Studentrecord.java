import java.util.ArrayList;

import java.util.Scanner;

class student{
private int studentid;
private String name;
private  int age;
private String deparment;

public student(int studentid,String name,int age,String deparment){
    this.studentid=studentid;
    this.name=name;
    this.age=age;
    this.deparment=deparment;
}

public int getstudentid(){
    return studentid;
}
public String getname(){
    return name;
}
public int Age(){
    return age;
}
public String  getdeparment(){
    return deparment;
}
@Override
public String toString() {
   return "\n\nstudentID:-"+getstudentid()+"\n"+"name :"+getname()+"\n"+"age"+Age()+"\n"+"deparment"+getdeparment()+"\n";

}
}
class studentrecordsystem {
    private int count;
    private ArrayList<student> students;

    public studentrecordsystem(){
    students = new ArrayList<student>();
    count = 0;
    }

    public void studentadd(student s){
        students.add(s);
        count++;
    }
    public void  serchid(int id){
        for ( student student :students) {
            if (student.getstudentid() == id) {
                System.out.println(student.toString());
                break;
                    }
                }

}
public void alldetail(){
    if(students.isEmpty()){
        System.out.println("no data found");
    }
    else{
    for ( student student :students) {
            System.out.println(student.toString());
            }
        }

}
}

public class Studentrecord
{    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        studentrecordsystem srs = new studentrecordsystem();
        while (true) {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student by ID");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int studentID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student department: ");
                    String department = scanner.nextLine();

                    student student = new student(studentID, name, age, department);
                    srs.studentadd(student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter student ID to search: ");
                    int searchID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                   srs.serchid(searchID);
                   break;
                case 3:
                    srs.alldetail();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
        


    }
