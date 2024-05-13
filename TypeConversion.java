// +++++++++++++++++ Type Conversion in java ++++++++++++++++++++++++++++e

public class TypeConversion{
    public static void main(String[] args) {
        
        // type casting(Implicit) storing small type of value into Large type of value.
        int integerValue = 3;
        System.out.println("Integer value is: "+integerValue);
        float floatValue = (float)integerValue;                 // Widening(no data loss)
        System.out.println("Float value is: "+ floatValue);

        // type casting(Explicit) storing large type of value into small type of value.
        float newFloatVal = 3.5f;
        int newIntegerVal = (int)newFloatVal;                    // narowing(data loss)
        System.out.println(newIntegerVal);



        // for checking the size of a data type.
        // System.out.println("Size of byte: " + (Integer.SIZE/8) + " bytes.");

        // The maximum value that a data type can store.
        // System.out.println("Size of byte: " + (Float.MAX_VALUE) + " bytes.");
    }
}