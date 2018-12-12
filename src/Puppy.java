public class Puppy {

    int PuppyAge;

    public Puppy(String name) {
        System.out.println("My puppy name is " + name);
    }

    public void setPuppyAge(int puppyAge) {
        PuppyAge = puppyAge;
    }

    public int getPuppyAge() {

        System.out.println("My puppy age is " + PuppyAge);

        return PuppyAge;
    }

    public static void main(String[] agrs) {
        Puppy puppy = new Puppy("Tommy Gun");

        puppy.setPuppyAge(18);

        puppy.getPuppyAge();

        System.out.println("The age is " + puppy.PuppyAge);

    }


}
