package worksheet2;

import java.util.Scanner;

public class constructor {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        customer c1 =new customer(100,"Raja",10);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        c1.setdiscount(15);
        System.out.println(c1.getdiscount());
        System.out.println(c1);
        
        invoice in=new invoice(1000,c1,2000);
        System.out.println(in.getid());
        System.out.println(in.getcustomer());
        customer c2 = new customer(101,"Ram",15);
        in.setcustomer(c2);
        System.out.println(in.getamount());
        in.setamount(2500);
        System.out.println(in.getcustomername()); 
        System.out.println(in.getamountafterdiscount());
    }
    
}

class customer 
{
    int id,discount;
    String name;
    customer(int i,String n,int d)
    {
    Scanner obj=new Scanner(System.in);
  
    id=i;
    name=n;
    discount=d;
    
    }
    
    
    int getid()
    {
    return id;
    }
    String getname()
    {
    return name;
    }
    int getdiscount()
    {
    return discount;
    }
    void setdiscount(int d1)
    {
      discount=d1;
    }
    public String tostring()
    {
        return "NAME:"+name+"ID:"+id ;
    }

}

class invoice
{
    int id;
    customer c;
    double amount;
    invoice(int i,customer c1,double a)
    {
        id=i;
        c=c1;
        amount=a;
        
    }
    int getid()
    {
        return id;
    }
    customer getcustomer()
    {
        return c;
    }
    void setcustomer(customer c2)
    {
        c=c2;    
    }
    double getamount()
    {
        return amount;
    }
    void setamount(double a)
    {
        amount=a;
    }
    String getcustomername()
    {
        return c.name;
    }
    double getamountafterdiscount()
    {
        return amount-(amount*c.discount)/100;
    }
  
}
