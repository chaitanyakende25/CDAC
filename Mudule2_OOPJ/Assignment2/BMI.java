import java.util.Scanner;
class BMI{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height in m: ");
        float height=sc.nextFloat();
        System.out.println("Enter weight in kg: ");
        float weight=sc.nextFloat();
        float bmi=weight/(height*height);

        if(bmi<18.5){
            System.out.println("Underweight: "+bmi);
        }
        else if(bmi>18.5 && bmi<24.5){
            System.out.println("Healthy Weight: "+bmi);
        }
        else if(bmi>25 && bmi<29.9){
            System.out.println("Overweight: "+bmi);
        }else{
            System.out.println("Obesity: "+bmi);
        }
    }
}