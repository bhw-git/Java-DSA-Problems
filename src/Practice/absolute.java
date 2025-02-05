package Practice;

import java.security.spec.RSAOtherPrimeInfo;

public class absolute {
    public static void main(String[] args) {
        // Math.abs() or absolute function is used return the positive values of the negative values
        // Only the "Integer.MIN_VALUE" and "Long.MIN_VALUE" will return the negative value.

        System.out.println(Math.abs(-83833));
        System.out.println(Math.abs(-394.2934f));
        System.out.println(Math.abs(-898623.932845));
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(Math.abs(Long.MIN_VALUE));
    }
}
