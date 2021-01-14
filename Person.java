public class Person {
    String name, gender;
    int age;

    public Person() {

    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.gender = sex;
    }

    public void introduce() {
        System.out.println("\nMy name : " + name + "\nGender : " + gender + "\nAge : " + age);
    }
}
