public class FirstClass {
    public static void main(String[] args){
        //Module 2.3
        System.out.println("Module 2.3");
        Notebook notebook = new Notebook(600,1000, 2020);
        Notebook heavyNotebook = new Notebook(2000,1500, 2015);
        Notebook oldNotebook = new Notebook(1200,300, 2000);
        System.out.println("notebook.weight: " + notebook.weight +" notebook.price: " + notebook.price + " notebook.price: " + notebook.price + " notebook.year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        System.out.println("heavyNotebook.weigh: " + heavyNotebook.weight + " heavyNotebook.price: " + heavyNotebook.price + " heavyNotebook.year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        System.out.println("oldNotebook.weight: " + oldNotebook.weight + " oldNotebook.weight: " + oldNotebook.price + " oldNotebook.year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        System.out.println();

        //Module 2.4
        System.out.println("Module 2.4");
        Grades grades = new Grades();
        grades.add(5);
        grades.add(2);
        grades.add(1);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(5);
        grades.add(1);
        grades.add(2);
        grades.add(1);
        System.out.println("Ostatnia dodana ocena: " + grades.readLast());
        System.out.println("Średnia ocen: " + grades.average());

    }
}
