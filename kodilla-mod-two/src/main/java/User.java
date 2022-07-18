public class User {
    private String name;
    private int age;

    public static void main (String[] args){
        User[] users = new User[5];
        float average;
        int sum = 0;
        users[0] = new User("Adam",20);
        users[1] = new User("Agnieszka",25);
        users[2] = new User("Magda",23);
        users[3] = new User("Grzegorz",22);
        users[4] = new User("Patrycja", 30);

        for (int i = 0;i < users.length;i++){
            sum = sum + users[i].age;
        }

        average = (float) sum / users.length;

        for (int i = 0;i < users.length;i++){
            if (users[i].age < average){
                users[i].displayName();
            }
        }

    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayName(){
        System.out.println("Imię użytkownika: " + this.name);
    }
}
