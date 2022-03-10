import java.util.Scanner;
public class Assignment2
{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      
	  do
	  {
	  System.out.println("**********************");
	  System.out.println(".....MENU.....");
      System.out.println("1.Circle");
      System.out.println("2.Triangle");
      System.out.println("3.Rectangle");
	  System.out.println("4.Cylinder");
	  System.out.println("5.Square");	  
      System.out.println("**********************");
	  
	  System.out.println("Please enter any of the above option :-");
      int choice = sc.nextInt();
      try
	  {
	  switch(choice)
      {
         case 1: System.out.println("Please enter radius of circle: ");
         double radius = sc.nextFloat();
         double areaCircle = (22 * radius * radius) / 7;
		 sc.nextLine();
         System.out.println("Area of circle is: " + areaCircle);
         break;
		 
         case 2: System.out.println("Please enter base and height of triangle: ");
         double base = sc.nextFloat();
         double height = sc.nextFloat();
         double areaTriangle = (base* height) / 2;
		 sc.nextLine();
         System.out.println("Area of triangle is: " + areaTriangle);
         break;
		 
         case 3: System.out.println("Please enter length and breadth of rectangle: ");
         int length = sc.nextInt();
         int breadth = sc.nextInt();
         int areaRectangle = length * breadth;
		 sc.nextLine();
         System.out.println("Area of ractangle is: " + areaRectangle);
         break;
		 
		  
     	 case 4: System.out.println("Enter the radius:");
      	 double r=sc.nextDouble();
		 System.out.println("Enter the height:");	
	     double h=sc.nextDouble();
		 sc.nextLine();
       	 double  tsa=((2*22*r)/7)*(r+h);
         System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
		 break;
		 
		 case 5: System.out.println("Enter Side of Square:");
         double side = sc.nextDouble();
		 sc.nextLine();
         double area = side*side; 
         System.out.println("Area of Square is: "+area);
		 break;
		 
		 default:
		 System.out.println("Invalid Case...");
		 break;
       		 
      }
	  }//try ki body end kii hai....
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	   System.out.println("Do you Continue or Not...");
	  }while(! sc.nextLine().equalsIgnoreCase("No"));
	   sc.close();
   }
}