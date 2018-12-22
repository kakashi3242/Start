import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    //    public void putAge() {
//        int age = 0;
//        age = age + 10;
//
//        System.out.println("My age is : " + age);
//
//    }
//
//    public static void main(String[] args) {
//        Test test = new Test();
//        test.putAge();
//    }
//    三目运算
//    public static void main(String[] args) {
//
//        int b;
//        Scanner input = new Scanner(System.in);
//        int  a = input.nextInt();
//
//        b = (a == 1) ? 20 : 30;
//
//        System.out.println("Value of b is " + b);
//
//        b = (a == 10) ? 20 : 30;
//
//        System.out.println("Value of b is " + b);
//    }

    private static String nowDate(){

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return simpleDateFormat.format(date);

    }


    public static void main(String[] args) {

        String nowDate = nowDate();

        System.out.println(nowDate);

    }


}
