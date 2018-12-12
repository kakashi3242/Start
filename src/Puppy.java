import java.awt.*;

public class Puppy {

    int PuppyAge;

    public Puppy(String name) {

        System.out.println("My puppy name is : " + name);

    }

    public void setPuppyAge(int puppyAge) {
        PuppyAge = puppyAge;
    }

    public int getPuppyAge() {

        System.out.println("Age is : " + PuppyAge);

        return PuppyAge;
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("Tommy");

        puppy.setPuppyAge(18);

        puppy.getPuppyAge();

        System.out.println(String.format("Variable value is : %s", puppy.PuppyAge));

    }


}