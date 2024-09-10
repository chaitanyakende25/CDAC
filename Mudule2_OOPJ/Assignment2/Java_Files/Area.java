import java.util.Scanner;
class Area{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter shape: ");
    String shape=sc.next();
   
    switch(shape){

        case "circle":
        case "Circle":
        case "CIRCLE":
            System.out.println("Enter radius:");
            int radius=sc.nextInt();
            System.out.println("Area of circle is: "+(3.14*radius*radius));
            break;

        case "Triangle":
        case "triangle":
        case "TRIANGLE":
            System.out.println("Enter height:");
            int height=sc.nextInt();
            System.out.println("Enter base:");
            int base=sc.nextInt();
            System.out.println("Area of triangle is: "+(height*base)/2);
            break;

        case "square":
        case "Square":
        case "SQUARE":
            System.out.println("Enter side:");
            int side=sc.nextInt();
            System.out.println("Area of square is: "+(side*side));
            break;

        case "rectangle":
        case "Rectangle":
        case "RECTANGLE":
            System.out.println("Enter length:");
            int length=sc.nextInt();
            System.out.println("Enter width:");
            int width=sc.nextInt();
            System.out.println("Area of rectangle is: "+(length*width));
            break;
        
        default:
            System.out.println("Invalid shape.");
    }
    }
}