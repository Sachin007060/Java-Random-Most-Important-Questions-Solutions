public class ThreadProgram extends Thread{
    public static void main(String[] args) {
        ThreadProgram t1 = new ThreadProgram();
        ThreadProgram t2 = new ThreadProgram();
        ThreadProgram t3 = new ThreadProgram();
        ThreadProgram t4 = new ThreadProgram();
        ThreadProgram t5 = new ThreadProgram();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
    public void run(){
        System.out.println("Program starts-----");
        System.out.println("am first 1");
        System.out.println("am first 2");
        System.out.println("am first 3");
        System.out.println("am first 4");
        System.out.println("am first 5");
        System.out.println("am first 6");
        System.out.println("Program ends-----");
    }
}