public class ConstructorProgram2{
    private int studenId, rollno;
    String studentName, collegeName;
    
    public ConstructorProgram2(String stdName, int id){
        studenId = id;
        rollno = 12;
        studentName = stdName;
        collegeName = "ITG";
    }
    
    public ConstructorProgram2(int id, int rNo, String stdName){
        studenId = id;
        rollno = rNo;
        studentName = stdName;
        collegeName = "ITG";
    }

    public void displaly(){
        System.out.println(studenId+" "+ rollno+" "+ studentName+" "+ collegeName);
    }
    
    public static void main(String[] args) {
        ConstructorProgram2 obj = new ConstructorProgram2("Sachin", 001);
        ConstructorProgram2 obj2 = new ConstructorProgram2(1001,002,"Manish");
        obj.displaly();
        obj2.displaly();
    }
}
