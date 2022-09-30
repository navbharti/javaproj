package nestedclass;

public class StaticNestedClass {
	
	    static String s = "Jain University";
	    
	    // Inner Class
	    static class StaticInnerClass
	    {
	        // Inner Class method
	        void print(String x)
	        {
	            System.out.println(s + " " + x);
	        }
	    }
	    
	    public static void main(String args[])
	    {
	        // Inner Class object
	        StaticInnerClass obj = new StaticInnerClass();
	        String y = "Welcomes You";
	        obj.print(y);
	    }
	}


