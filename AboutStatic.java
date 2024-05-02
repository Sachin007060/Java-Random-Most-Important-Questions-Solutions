//Declaring the static variable, static method and static class.
// public class AboutStatic {
//     public static void main(String[] args) {
//         int instanceVariable;               // Instance variable.
//         static int staticVarable;           // static member variable.

//         public void fun1(){}                 // Instance member method.
//         public static void fun2(){}         // static member method.

//         static class staticClass{           // static class.

//         }
//     }
// }

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Accessing the static variable and function.
// class Student{
//     String name;
//     int age;
//     int rollNo;
//     static String clgName = "G.P Gauchar";
//     void change(){
//         Student.clgName = "G.P Srinagar";
//     }
//     void display(String name, int age, int rollNo){
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(rollNo);
//         System.out.println(clgName+"\n");
//     }
// }

// public class AboutStatic{
//     public static void main(String[] args) {
//         Student refrenceObj = new Student();
//         refrenceObj.display("Sachin", 22, 12340);
//         refrenceObj.change();
//         refrenceObj.display("Aman", 23, 1234);
//     }
// }

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// The default values of the static variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null.
// public class AboutStatic{
//     static String clgName;
//     public static void main(String[] args) {
//         System.out.println(clgName+"\n");
//     }
// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Assigning value in the static variable first is directly.
// public class AboutStatic{
//     static String clgName= "G.P Gauchar";
//     public static void main(String[] args) {
//         System.out.println(clgName+"\n");
//     }
// }

// Assigning value in the static variable using || (AboutStatic.clgName;):-Syntax:-class_name with dot and static_variable_name.
// public class AboutStatic{
//     static String clgName;
//     public static void main(String[] args) {
//         AboutStatic.clgName = "H.N.B.U";
//         System.out.println(clgName+"\n");
//     }
// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Accessing the static method.
// class Student{
//     int x;
//     static int y;
//     public static void changeStaticValue(){
//         y = 4;
//     }
// }
// public class AboutStatic{
//     public static void main(String[] args) {
//         Student.changeStaticValue();    //Accessing the static method from another class.
//         System.out.println("Static variable y value is:-"+Student.y);    //Accessing the static variable from another class.
//     }
// }

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Creating static inner class and accessing it.
class Student{
    int x;
    static int y;
    public static void changeStaticValue(){
        y = 4;
    }
    static class test{
        public static String country = "INDIA";
    }
}

public class AboutStatic{
    public static void main(String[] args) {
        Student.changeStaticValue();    
        System.out.println("Static variable y value is:-"+Student.y);  
        System.out.println(Student.test.country);  
    }
}