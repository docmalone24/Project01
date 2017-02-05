package project01.week4;

/**
 * Created by Mike on 2/5/17.
 */
public class MainClass {
    public static void main(String[] args)
    {
        TestClass printMessage = new TestClass();

        for (int i = 1; i < printMessage.getTestInt(); i++)
        {
            System.out.println(i + ": " + printMessage.getTestString());
        }
    }
}
