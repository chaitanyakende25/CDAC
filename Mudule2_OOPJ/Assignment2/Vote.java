import java.util.Scanner;
class Vote{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter age: ");
    float age=sc.nextFloat();
    if(age<18){
        System.out.println("Not eligible for vote.");
    }else{
        System.out.println("Eligible for vote.");
    }
    }
}