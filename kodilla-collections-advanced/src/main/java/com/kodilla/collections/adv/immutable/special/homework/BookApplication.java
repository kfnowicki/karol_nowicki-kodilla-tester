package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book institute = BookManager.createBook("Stephen King","The Institute");
        Book mind = BookManager.createBook("Richard Tylor","The Mind of a Murderer");
        Book core = BookManager.createBook("Cay S. Horstmann", "Core Java: Fundamentals");
        Book coreB = BookManager.createBook("Cay S. Horstmann", "Core Java: Fundamentals");
        Book mindB = BookManager.createBook("Richard Tylor","The Mind of a Murderer");

        isAddressEqual(institute,mind);
        isAddressEqual(mind,core);
        isAddressEqual(institute,core);
        isAddressEqual(core,coreB);
        isAddressEqual(mindB,mind);

    }

    private static void isAddressEqual(Book a, Book b){
        System.out.println("-----------");
        System.out.println("Address of \"" + a.getTitle() + "\" and: \"" + b.getTitle() + "\" is the same:");
        System.out.println(a == b);
    }
}
