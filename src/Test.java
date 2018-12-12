public class Test {
    public void putAge() {
        int age = 0;
        age = age + 10;

        System.out.println("My age is : " + age);

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.putAge();
    }

}
