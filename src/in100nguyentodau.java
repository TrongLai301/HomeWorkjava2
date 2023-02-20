import java.util.*;
public class in100nguyentodau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen: ");
        int n = scanner.nextInt();
        for(int i = 2; i <= n; i++){
            if (check(i) == true){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean check(int n) {
        if(n<2) return false;
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n % i == 0) return false;

        }
        return true;
        }

    }

