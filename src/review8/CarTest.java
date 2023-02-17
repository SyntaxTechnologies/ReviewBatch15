package review8;

public class CarTest {

    public static void main(String[] args) {

        Bmw bmw=new Bmw("Bmw", "X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake();

        

    }
}
