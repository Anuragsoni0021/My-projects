package calculator;                                                  /*if your file is in nested folder then to compile your file*/
import java.util.*;                                                  /*use javac outer\inner\MyClass.java */      
public class cal{                                                    /* to run your file*/                                              
   public static void main(String[] args){                          /* java -cp . outer.inner.MyClass */
      Scanner sc = new Scanner(System.in);

      System.out.println("enter the first number ");
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
         double division = a/b;
         if(b!=0){
            System.out.println("result\n"+division);
         }else{
            System.out.println("number is not divisible by zero");
         }
         break;
      }
         sc.close();
      }
      

}

