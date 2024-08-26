class Calculator{
public static void main(String args[]){

float n1=5f, n2=6f;
String operator="*";

switch(operator){

case "+":
System.out.println("Addition is:"+(n1+n2));
break;

case "-":
System.out.println("Substraction is:"+(n1-n2));
break;

case "*":
System.out.println("Multiplication is:"+(n1*n2));
break;

case "/":
System.out.println("Division is:"+(n1/n2));
break;

}

}
}