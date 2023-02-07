
public class Q_5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        System.out.println("before swaping");
        int w=1;
        int a=2;
        int k=3;
        int g=4;
        System.out.println(" w "+w+" "+" a "+a+" "+" k "+k+" "+" g "+g);
        System.out.println("after swaping");
        w=w+a+k+g;
        a=w-(a+k+g);
        k=w-(a+k+g);
        g=w-(a+k+g);
        w=w-(a+k+g);
        System.out.println(" w "+w+" "+" a "+a+" "+" k "+" "+k+" "+" g "+g);
        
    
             
        
	}

}
