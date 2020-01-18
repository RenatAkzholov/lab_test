package tests;

import java.math.BigInteger;

import org.junit.*;

import app.*;

public class MyIntTest {

    @Test
    public void MyInt_String() {
        
        MyInt num1;
        num1 = new MyInt("2722df");
        Assert.assertEquals(null, num1.num);
        
        MyInt num2;
        num2 = new MyInt("+2722");
        BigInteger exp2 = new BigInteger("+2722");
        Assert.assertEquals(exp2, num2.num);
        
        MyInt num3;
        BigInteger exp3 = new BigInteger("-2722");
        num3 = new MyInt("-2722");
        Assert.assertEquals(exp3, num3.num);
        
        MyInt num4;
        num4 = new MyInt(" -2722");
        Assert.assertEquals(null, num4.num);
    }
}
