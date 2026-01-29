import java.util.Scanner;

public class HermosaHighSchool {
    private float calculateBookStoreCredit(float Gpa){
        return Gpa * 10;
    }

    void main(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to the Bookstore credit's System Hermosa High School.");
            System.out.println("Enter Student's name: ");
            String name = sc.nextLine();
            System.out.println("Enter GPA: ");
            float gpa = sc.nextFloat();
            float result = calculateBookStoreCredit(gpa);
            System.out.println("For Student: " + name + " Their Bookstore credit is:");
            System.out.println("$" + result);
        }

    }


}
