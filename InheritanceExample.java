public class InheritanceExample {

    public static void main(String[] args) {

        Artist art = new Artist("Ball", 20, "Male");
        Jobs p1 = new Jobs("Vanida", 19, "Female");
        Jobs p2 = new Jobs("Pop", 19, "Male");
        Jobs p3 = new Jobs("Pon", 19, "Male");
        Jobs p4 = new Jobs("Ganyu", 3000, "Female");
        Jobs p5 = new Jobs("Zhongli", 5000, "Male");

        art.genre = "hip hip";
        art.introduce();
        art.playMusic();

        p1.job = "Doctor";
        p1.introduce();
        p1.showJobs();

        p2.job = "Engineer";
        p2.introduce();
        p2.showJobs();

        p3.job = "Computer Master";
        p3.introduce();
        p3.showJobs();

        p4.job = "Gilen";
        p4.introduce();
        p4.showJobs();

        p5.job = "God";
        p5.introduce();
        p5.showJobs();

    }

}