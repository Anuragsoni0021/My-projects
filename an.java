import java.util.*;
public class an{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("enter the first number` ");
      int a = sc.nextInt();
      System.out.println("enter the second number` ");
      int b = sc.nextInt(); 
      System.out.println("enter the operater ");
      char operator = sc.next().charAt(0);
   
      switch(operator){
         case '+' :
         double addition = a+b;
         System.out.println("result:\n" +addition);
         break;
         case '-' :
          double subtraction = a-b;
         System.out.println("result\n" +subtraction);
         break;
         case '*' :
         double multiplication = a*b;
         System.out.println("result\n" +multiplication);
         break;
         case '/' : 
         double division;
         if(b!=0){
            System.out.println("result\n"+a/b);
         }else{
            System.out.println("number is not divisible by zero");
         }
         break;
         

      }
















}

}