import java.util.*;
class LeapYearSwitch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
    
        switch(year%4){
            case 0:
                switch(year%100){
               case 0:
                switch(year%400){
                    case 0:
                            System.out.println("Leap year");
                            break;
                            default:
                            System.out.println("Not a leap year"); 
                            }
                           break;
                    default:
                    System.out.println("Leap year");
                    }
                    break;
                default:
                        System.out.println("Not a leap year");
                        break;
        }

    }
}

