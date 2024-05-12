public class WrapperClass {
    public static void main(String[] args) {

        // using valueOf method of the wrapper class.
        Integer i1 = Integer.valueOf("1010011",2);      // in a binary form with its base.
        Integer i2 = Integer.valueOf("123");
        Double d1 = Double.valueOf("3.14");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(d1);
        
        //Using parseXxx method of the wrapper class.
        int p1 = Integer.parseInt("312");
        System.out.println(p1);
        double d2 = Double.parseDouble("31.232");
        System.out.println(d2);
        
        //Using xxxValue method of the wrapper class.
        Integer y = 2323;
        System.out.println(y.intValue());
        Float f  = 213.23f;
        System.out.println(f.floatValue());
        int value = i1.intValue();
        System.out.println(value);
    }
}
