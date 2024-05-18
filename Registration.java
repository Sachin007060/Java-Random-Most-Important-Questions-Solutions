public class Registration{
    public static void checkElegiblity(int age) throws UnderAgeException{
        if(age>=18){
            System.out.println("You are eligible for registration!!");
        }else{
            throw new UnderAgeException();
        }
    }
}
