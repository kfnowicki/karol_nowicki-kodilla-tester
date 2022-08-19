package com.kodilla.collections.adv.immutable;

public class BookHacked extends Book{
    private String realTitle;
    public BookHacked(String author, String title) {
        super(author, title);
        realTitle = title;
    }

    public void modifyTitle(String newTitle) {
        realTitle = newTitle;
    }

    // comment below because of errors caused by overriding final method
    /*
    @Override
    public String getTitle() {
        return realTitle;
    }
     */
}
