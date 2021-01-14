public class Jobs extends Person {
    String job;

    public Jobs(String name, int age, String sex) {
        this.age = age;
        this.name = name;
        this.gender = sex;
    }

    public void showJobs() {
        System.out.println(name + " want to be " + job + ".");
    }

}
