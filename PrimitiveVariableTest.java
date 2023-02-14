
/**
 * Write a description of class PrimitiveVariableTest here.
 *
 * @author Rune Nicholson
 * @version 14/02/2023
 */
public class PrimitiveVariableTest
{
    // instance variables - replace the example below with your own
    private byte byteTest = 126;
    private short shortTest = -32768;
    private int intTest = 5;
    private long longTest = 3287637628736l;
    private float floatTest = 3.54159f;
    private double doubleTest = 5674.872992;
    private boolean booleanTest = true;
    private char charTest = 'g';
    

    /**
     * Constructor for objects of class PrimitiveVariableTest
     */
    public PrimitiveVariableTest()
    {
        // initialise instance variables
        System.out.println("A value a byte can contain is " + byteTest);
        System.out.println("A value a short can contain is " + shortTest);
        System.out.println("A value a int can contain is " + intTest);
        System.out.println("A value a long can contain is " + longTest);
        System.out.println("A value a float can contain is " + floatTest);
        System.out.println("A value a double can contain is " + doubleTest);
        System.out.println("A value a boolean can contain is " + booleanTest);
        System.out.println("A value a char can contain is " + charTest);
        
        byteTest++;
        shortTest++;
        intTest++;
        longTest++;
        floatTest++;
        doubleTest++;
        charTest++;
        // booleanTest++; doesn't work as there's no logical value after true. However, it works for all the other variables being tested (including char, where it goes to the next letter of the alphabet)
        
        byteTest += shortTest; // this sets it down to the negative limit of a byte (-128) because shortTest is a very negative number
        // intTest += charTest; doesn't work, as charTest is not a number
        charTest += intTest; // this, however, does work, as the alphabet has a logical order, so it just goes along the alphabet
        charTest += floatTest; // this rounds down the float - increasing charTest by 4
        charTest += floatTest; // confirming that it doesn't keep the digits after the decimal place (otherwise it would've been 'x' instead of 'v')
        
        charTest -= 18;
        charTest *= 2; // gives a capital letter with an accent due to d being 100 in ASCII, so 200
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
