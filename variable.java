/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;

public class variable {
    public static void main(String[] args)
    {
        /*
       *student s=new student();
       *s.getvalue();
       *s.calgrade();\\to get one record
       *s.display();
       */
        student obj[]=new student[100];
        for (int i=0;i<=9;i++)
        {
            obj[i]=new student();
            obj[i].getvalue();
            obj[i].calgrade();
            obj[i].display();
        }
          
        
        
        
            } 
}
class student
{
    
    String name;
    String dept;
    String result;
    double m1,m2,m3;
    void getvalue()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the input");
        name=obj.next();
        dept=obj.next();
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();
       
    }
    void calgrade()
    {
        double a=(m1+m2+m3)/3;
        
         if(a>80)
            result="FIRST CLASS";
        else if(a>70 && a<=79)
           result="SECOND CLASS";
        else if(a>50 && a<=69)
           result="THIRD CLASS";
        else
            result="FAIL";
        
       
    }

    void display()
    {
        double a=(m1+m2+m3)/3;
        System.out.println("NAME:\t"+(name)+"\nDEPT:\t"+(dept)+"\nM1:\t"+m1+"\nM2:\t"+m2+"\nM3:\t"+m3+"\nAVERAGE:\t"+a+"\nRESULT:\t"+(result));
    }

}
        
       