import java.util.Scanner;
class PassOrFail{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int failCount=0;

System.out.println("Enter marks of first subject:");
int a=sc.nextInt();

System.out.println("Enter marks of second subject:");
int b=sc.nextInt();

System.out.println("Enter marks of third subject:");
int c=sc.nextInt();

switch(a>40?1:0){
case 0: failCount++;
}

switch(b>40?1:0){
case 0: failCount++;
}

switch(c>40?1:0){
case 0: failCount++;
}

switch(failCount){
case 0: System.out.println("Passed");
break;

case 1: System.out.println("Failed in "+failCount+" subject.");
break;

case 2: System.out.println("Failed in "+failCount+" subject.");
break;

case 3: System.out.println("Failed in "+failCount+" subject.");
break;
}


}
}