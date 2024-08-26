class DiscountCalculation  {
public static void main(String args[]){
int purchase=400;
boolean membership=true;

if(purchase>=1000){
if(membership==true){
System.out.println("After discount total is:"+(purchase-1000*0.25));
}
else
{
System.out.println("After discount total is:"+(purchase-1000*0.2));
}
}

if(purchase>=500 && purchase<=999){
if(membership==true){
System.out.println("After discount total is:"+(purchase-1000*0.15));
}
else
{
System.out.println("After discount total is:"+(purchase-1000*0.1));
}
}

if(purchase<=500){
if(membership==true){
System.out.println("After discount total is:"+(purchase-1000*0.1));
}
else
{
System.out.println("After discount total is:"+(purchase-1000*0.05));
}
}

}
}