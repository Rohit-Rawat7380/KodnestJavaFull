public class demo1 {
    public static void main(String[] args) {
       String Customer_name = "Rahul" ;
       int units = 350 ;
       int bill = 0 ;
       int surcharge=0 ;
       int total = 0 ;
       if(units>=0 && units<=100){
         bill = 350*2 ;
       }
       else if(units>=101 && units<=200){
         bill = 350*3 ;
       }
       else if(units>=201 && units<=300){
         bill = 350*5 ;
       }
       else if(units>300){
         bill = 350*7 ;
       }
       if(bill > 1000){
         surcharge = 0.05*(int)bill ;
       }

       if(units <= 0){
         System.out.println("Invalid Units");
       }
       total = bill + surcharge ;
       System.out.println("Customer name : " + Customer_name);
       System.out.println("Units consumed: " + units);
       System.out.println("Electricity bill: " + bill);
       System.out.println("Surcharge: " + surcharge);
       System.out.println("Total bill: " + total);
       
    }
}