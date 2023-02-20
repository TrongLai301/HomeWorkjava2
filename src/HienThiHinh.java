import java.util.*;
public class HienThiHinh {
    public static void main(String[] args) {
        int enter = -1;
        Scanner sc=new Scanner(System.in);
        while(enter != 4){
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Enter choose: ");
        enter= sc.nextInt();
        switch (enter){
                case 1:
                    for(int k=1;k<=3;k++){
                        System.out.println(" ");
                        for(int j=1;j<=6;j++){
                            System.out.print("* ");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    for(int k=1;k<=5;k++){
                        System.out.println(" ");
                        for(int j=1; j<=k;j++){
                            System.out.print("* ");
                        }

                    }
                    System.out.println(" ");
                    for(int k=1;k<=5;k++){
                         System.out.println(" ");
                         for(int j=5; j>=k;j--){
                            System.out.print("* ");
                    }

                }
                    System.out.println(" ");
                    break;
                    case 3:
                     int num=4;
                     for(int i=1, c=0;i<=num;i++,c++){
                         for(int j=0;j<num-i;j++){
                             System.out.print(" ");
                         }
                         for(int k=0;k<i+c;k++){
                             System.out.print("*");
                         }
                         System.out.println(" ");
                }
                     break;

            case 4:
                System.exit(4);
                break;
            default:
                System.out.println("No choose!");
        }
        }
        }
    }




