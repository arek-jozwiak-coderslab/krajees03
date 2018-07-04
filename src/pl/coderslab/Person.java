package pl.coderslab;

import java.time.LocalDateTime;
import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDateTime birthDay;
    private int height;

    public Person() {
        System.out.println("Create object ");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void destroy(){
        System.out.println("kill person");
    }

    protected char protectedGender;
    public String publicAddress;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }
}
