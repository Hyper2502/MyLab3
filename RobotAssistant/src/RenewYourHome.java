import java.util.Scanner;

public class RenewYourHome {

    private static int Calculateprice(int hours, int materials){
        return hours*(materials + 35);
    }

    private static int costToGo(int hours){
        return hours * 12;
    }

    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the job?");
        String name = sc.nextLine();
        System.out.println("What are the cost of the materials?");
        int materials = sc.nextInt();
        System.out.println("How many hours of job");
        int workhours = sc.nextInt();
        System.out.println("How many hours to go to that place?");
        int hours = sc.nextInt();
        int materialsResult = Calculateprice(materials, workhours);
        int hoursResult = costToGo(hours);

        System.out.println(name);
        System.out.println("The Result for the job would be:");
        System.out.println("Materials With Work Hours Result: $" + materialsResult);
        System.out.println("Hours Result: $" + hoursResult);
        System.out.println("Total: $" + (materialsResult + hoursResult));


    }
}
