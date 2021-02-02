import java.util.Scanner;

public class LineCompute 
{

	public static void main(String[] args) 
	{
	    System.out.println("Calculate Distance Between Two Point");	
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the choice=");
	    int ch=sc.nextInt();
	    
	    switch(ch)
	    {
	    case 1: System.out.println("to calculate the lenght");
	            UC1 ob1=new UC1();
	            ob1.lenghts();
	            break;
	            
	    case 2: System.out.println("To check the equality of two line");
	            UC2 ob2=new UC2();
	            ob2.Equal();
	            break;
	            
	    case 3: System.out.println("To compare two lines");
	            UC3 ob3=new UC3();
	            ob3.compare();
	            break;
	            
	    default:System.out.println("Enter the correct choice");
	            break;
	    }
	        
	}
		 
}

class UC1
{
	public void lenghts()
	{
		 int x1,x2,y1,y2;
	        double distance;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter x1 point");
	        x1=sc.nextInt();
	        System.out.println("enter y1 point");
	        y1=sc.nextInt();
	        System.out.println("enter x2point");
	        x2=sc.nextInt();
	        System.out.println("enter y2 point");
	        y2=sc.nextInt();
	        distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")>>>>"+distance);

	}
}

class UC2
{
	public void Equal() 
	{
		    int x1,x2,y1,y2;
		    double distance1;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter x1 point");
	        x1=sc.nextInt();
	        System.out.println("enter y1 point");
	        y1=sc.nextInt();
	        System.out.println("enter x2point");
	        x2=sc.nextInt();
	        System.out.println("enter y2 point");
	        y2=sc.nextInt();
	        distance1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")>>>>"+distance1);
	        
	        int p1,p2,q1,q2;
		    double distance2;
	       
	        System.out.println("enter p1 point");
	        p1=sc.nextInt();
	        System.out.println("enter q1 point");
	        q1=sc.nextInt();
	        System.out.println("enter p2point");
	        p2=sc.nextInt();
	        System.out.println("enter q2 point");
	        q2=sc.nextInt();
	        distance2=Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
	        System.out.println("distancebetween"+"("+p1+","+q1+"),"+"("+p2+","+q2+")>>>>"+distance2);
	        
	        Double obj1=new Double(distance1);
	        Double obj2=new Double(distance2);

	        if(obj1.equals(obj2))
	        {
	        	System.out.println("Both lines are equal");
	        }
	        else
	        {
	        	System.out.println("Both lines are not equal");
	        }
	}
}

class UC3
{
	public void compare()
	{
		int x1,x2,y1,y2;
	    double distance1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 point");
        x1=sc.nextInt();
        System.out.println("enter y1 point");
        y1=sc.nextInt();
        System.out.println("enter x2point");
        x2=sc.nextInt();
        System.out.println("enter y2 point");
        y2=sc.nextInt();
        distance1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")>>>>"+distance1);
        
        int p1,p2,q1,q2;
	    double distance2;
       
        System.out.println("enter p1 point");
        p1=sc.nextInt();
        System.out.println("enter q1 point");
        q1=sc.nextInt();
        System.out.println("enter p2point");
        p2=sc.nextInt();
        System.out.println("enter q2 point");
        q2=sc.nextInt();
        distance2=Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
        System.out.println("distancebetween"+"("+p1+","+q1+"),"+"("+p2+","+q2+")>>>>"+distance2);
        
        Double obj1=new Double(distance1);
        Double obj2=new Double(distance2);
        int comparevalue=obj1.compareTo(obj2);

        if(comparevalue==0)
        {
        	System.out.println("Both lines are same");
        }
        else if(comparevalue>0)
        {
        	System.out.println("distance1 is greater than distance2");
        }
        else
        {
        	System.out.println("distance1 is less than distance2");
        }
	}
}
