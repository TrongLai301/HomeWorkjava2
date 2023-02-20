import java.util.*;
public class TestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        if (num<2){
            System.out.println( num+" is not prime");
        }else{
            int i=2;
            boolean check =true;
            while(i<Math.sqrt(num)){
                if(num%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check) {
                System.out.println(num+" is prime");
            }else{
                System.out.println(num+" is not prime");
            }
            }
            }


        }



