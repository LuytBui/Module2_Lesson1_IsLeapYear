import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số năm: ");
        int year = sc.nextInt();
        String result = "Năm " + year;
        result += isLeapYear(year)? " là năm nhuận." : " không phải là năm nhuận.";
        System.out.println(result);
    }

    public static boolean isLeapYear(int number){
        if (number % 400 == 0){
            return true;
        }
        if (number % 100 == 0){
            return false;
        }
        return number % 4 == 0;
    }
}
