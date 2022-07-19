public class Application {
    String name;
    double age;
    double height;

    public static void main(String[] args){
        Application app = new Application("Adam",40.5,178);
        app.checkAgeHeight(30,160);
    }

    public Application(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkAgeHeight(int minAge, int minHeight ) {
        if (this.age > minAge && this.height> minHeight ) {
            System.out.println("User is older than " + minAge + " and taller than " + minHeight +"cm");
        } else {
            System.out.println("User is "+ minAge +" (or younger) or " + minHeight +"cm (or shorter)");
        }
    }

}
