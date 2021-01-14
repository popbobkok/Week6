public class Artist extends Person {

    String genre;

    public Artist(String name, int age, String sex) {
        this.age = age;
        this.name = name;
        this.gender = sex;
    }

    public void playMusic() {
        System.out.println(name + " is playing " + genre + " music.");
    }

    
}
