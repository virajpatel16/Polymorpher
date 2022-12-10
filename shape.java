//1. Write a simple java application that creates a Shape class with two double data members. 
//The class should have area methods to calculate the area of shape. 
//Inherit two classes Rectangle and Triangle from Shape class. 
//Demonstrate method overriding & Super keyword.
import java.util.Scanner;

public class shape {

 int width;
 int height;
 int a;

   public static void main(String[] args) {
      tri t = new tri();
      t.calculate();
      t.math();


   }

   void calculate(){
    

     System.out.println("enteer the width");
     Scanner Sc =new Scanner(System.in);
     width =Sc.nextInt();
     System.out.println("enter the height");
     height=Sc.nextInt();

     a=width*height;
     System.out.println("the area is "+a);
   }



    
}
class react extends shape{
  int l=11;
  int w=22;
  int d;

void math(){
     
    System.out.println("enter the length");
    Scanner Sc=new Scanner(System.in);
    l=Sc.nextInt();
    System.out.println("enter the width");
    w=Sc.nextInt();

    d=l*w;

    System.out.println("the reactangle is "+d);

}


  
    


}

class tri extends react{


    

void math(){

   double  c;
    double bess;
    double height;

    System.out.println("enter the bess");
    Scanner Sc = new Scanner(System.in);
    bess=Sc.nextDouble();
    System.out.println("enter the height");
    height=Sc.nextDouble();

  c=bess*height*2;

  System.out.println("the triangle is "+c);
  super.math();

}


}

