import java.util.*;
class LeapYearIf{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%400==0 || year%100!=0){
                System.out.println("Leap Year");
        }else{
            System.out.println("Not leap year");
        }
    }else{
            System.out.println("Not leap Year");
        }
}
}