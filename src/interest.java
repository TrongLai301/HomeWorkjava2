import java.util.*;
public class interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter deposits:");
        double deposits= sc.nextDouble();
        System.out.print("Enter interest:");
        double interest= sc.nextDouble();
        System.out.print("Enter month:");
        int month= sc.nextInt();
        double total=0;
        for(int i=0;i<month;i++){
            total=total+deposits*(interest/100)/12*month;
        }
        System.out.println(total);

    }
}
