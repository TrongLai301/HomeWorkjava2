import java.util.*;
public class greateCommomfator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a= Math.abs(sc.nextInt());
        System.out.print("Enter b: ");
        int b=Math.abs(sc.nextInt());
        int max=Math.max(a,b);
        for(int i=max;i>0;i--) {
            if (a == 0 || b == 0) {
                System.out.println(i + " is not greatest common divisor");
            } else {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i + " is greatest common divisor");
                    break;
                }
            }
        }
        }
    }

