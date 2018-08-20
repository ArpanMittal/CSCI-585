
import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
        double a=5, b=3, c=5;

	
		for(double t=0.0;t<(Math.PI*6);t+=0.01) 

		{

		double x=(a+b)*Math.cos(t) - c*Math.cos((a/b+1)*t);

		double y=(a+b)*Math.sin(t) - c*Math.sin((a/b+1)*t);

		System.out.println((0.0005*x -118.289400) + "," + (0.0005*y+34.020951) + ",");

		}
    }
}