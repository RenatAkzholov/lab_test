package app;

import java.nio.charset.StandardCharsets;
import java.security.cert.Extension;
import java.util.regex.Pattern;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.Math;
import java.math.BigInteger;

public final class MyInt
{
    public BigInteger num;

    public MyInt(String num) {
        Pattern regex = Pattern.compile("^[+-]?\\d+$");
        if (regex.matcher((CharSequence)num).matches()) {
            this.num = new BigInteger(num);
        }
    }
    
    public MyInt(int num) {
        this.num = new BigInteger(Integer.toString(num));
    }
    
    public BigInteger add(BigInteger num2) {
        
    	if (num != null)
            return num.add(num2);
        return null;
    }

    public BigInteger subtract(BigInteger num2) {
        
    	if (num != null)
            return num.subtract(num2);
        return null;
    }

    public BigInteger multiply(BigInteger num2) {
        
    	if (num != null)
            return num.multiply(num2);
        return null;
    }

	public BigInteger divide(BigInteger num2) {
        
    	if (num != null)
            return num.divide(num2);
        return null;
    }

    public BigInteger max(BigInteger num2) {
        
    	if (num != null)
            return num.max(num2);
        return null;
    }

    public BigInteger min(BigInteger num2) {
        
    	if (num != null)
            return num.min(num2);
        return null;
    }

	public BigInteger abs() {
		
		if (num != null)
            return num.abs();
        return null;
	}

	public Integer compareTo(BigInteger num2) {
        
    	if (num != null)
            return num.compareTo(num2);
        return null;
    }
	
	public String toString() {
		
		if (num != null)
            return num.toString();
        return null;
	}

	public long longValue() {
		
		if (num != null)
            return num.longValue();
	}
	
	public BigInteger gcd(BigInteger num2) {
        
    	if (num != null)
            return num.gcd(num2);
        return null;
    }
}
