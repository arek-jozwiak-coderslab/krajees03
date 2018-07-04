package pl.coderslab;

public class Hero extends Person {



    int age;

    public void showAge(){
        System.out.println(this.age);
    }

    public int returnInt(int a, int b) {

        return a + b;
    }

    public static void doSth() {
        System.out.println("so sth");
    }

    private String power;

    public Hero(String power, String firstName, String lastName) {
//        super(firstName, lastName);
        this.power = power;
    }

    @Override
    public void destroy() {
        System.out.println("kill hero");
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
