package worksheet2;

/**
 *
 * @author ELCOT
 */
class box
{
     double height;
     double width;
     double depth;

}

public class volume {
    public static void main(String[] args)
    {
        box obj=new box();
        obj.height=10;
        obj.width=20;
        obj.depth=30;
        double vol=obj.depth*obj.height*obj.width;
        System.out.println("volume"+vol);
    }
    
}
