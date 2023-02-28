import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        name = name.toLowerCase();
        int result = 0;
        for (int i= 0;i<name.length();i++){
            switch (name.charAt(i)){
                case 'a','j','s' -> result += 1;
                case 'b','k','t' -> result += 2;
                case 'c','l','u' -> result += 3;
                case 'd','m','v' -> result += 4;
                case 'e','n','w' -> result += 5;
                case 'f','o','x' -> result += 6;
                case 'g','p','y' -> result += 7;
                case 'h','q','z' -> result += 8;
                case 'i','r' -> result += 9;
                default ->result += 0;
            }
        }
//        System.out.println(result);
        while (result > 9) {
            int sum = 0;
            while (result != 0) {
                int digit = result % 10;
                sum += digit;
                result /= 10;
            }
            result=sum;
        }
        System.out.println("Your're a person in chapter "+ result);
    }
}