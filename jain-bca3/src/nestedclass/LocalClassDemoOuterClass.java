package nestedclass;

public class LocalClassDemoOuterClass {
    public static void main(String args[])
    {
        String s = "Jain University";
        if (s.charAt(0) == 'J')
        {
            // child class
            class InnerClass
            {
                void print(String x)
                {
                    System.out.println(s + " " + x);
                }
            }
            // inner class object
            InnerClass childObj = new InnerClass();
            String y = "Welcomes You";
            // calling inner class method
            childObj.print(y);
            // InnerClass is accessible till here only
        }
        // InnerClass is not accessible here
    }
}
