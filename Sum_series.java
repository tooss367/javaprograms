import java.util.*;
class Series
{// start of class
    int n,x;//instance variables
    void input()
    {//function to accept the number of terms & value of x using Scanner class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();//to accept and store the value of n from user
        System.out.println("Enter the number of  x ");
        x=sc.nextInt();//to accept and store the value of x from user
    }

    void sum_of_series()
    {//function to calculate sum of the series
        double s=1.0;//initialize
        for(int i=2;i<=n;i=i+2)
        {
            double t=calculate(x,i)/calculate(i);
            if(i%4==0)
                s=s+t;
            else
                s=s-t;
        }
        display(s);
    }

    void display(double s)
    {//function to display the sum of the series
        System.out.println("Sum of the series " +s);
    }

    double calculate(int b, int e)
    {//function to calculate the power of x without iteration
        if(e==0)
            return 1;
        else
            return (b*calculate(b,e-1));
    }

    int calculate(int n)
    {//function to calculate the factorial of the denominator
        int f=1;
        for(int i=1;i<=n;i++)
            f=f*i;
        return f;
    }
}//end of class
public class Sum_series
{// start of class
    public static void main()
    {//start of main()
        Series ob=new Series();
        ob.input();
        ob.sum_of_series();
    }//end of main()
}//end of class
