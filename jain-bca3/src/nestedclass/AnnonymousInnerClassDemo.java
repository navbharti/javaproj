package nestedclass;

abstract class Printer {
	// abstract Class
    abstract void print(String x);
}
// Outer Class
class AnnonymousInnerClassDemo
{
    public static void main(String args[])
    {
        // Anonymous Inner Class
    	Printer obj = new Printer() { 
            void print(String x)
            {
                System.out.println("Jain University " + x);
            }
        };
        String y = "Welcome You";
        obj.print(y);
    }
}
