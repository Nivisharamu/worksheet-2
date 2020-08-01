package worksheet2;

import java.util.Scanner;

class box1

{
   
     double height;
     double width;
     double depth;


     void getvalue()
     { 
             Scanner obj=new Scanner(System.in);
             System.out.println("Enter the input");
             depth =obj.nextDouble();
             width =obj.nextDouble();
             height =obj.nextDouble();
     }
     void volume()
     {
         double vol=depth*width*height;
         System.out.println("volume"+vol);
     }
             
}            


/**
 *
 * @author ELCOT
 */
public class volume1
{
    public static void main(String[] args)
    {
        box1 obj=new box1();
        obj.getvalue();
        obj.volume();
        
        box1 obj1=new box1();
        obj1.getvalue();
        obj1.volume();
    }
}

/**
 *
 * @author ELCOT
 */

    

