package bibliothek;

public abstract class Book {

    protected String title;

    public static int totalBooks = 0;

    public abstract String getAuthor();

    public String getTitle() {
        return this.title;
    }

    public static int lengthOfISBN() {
        return 18;
    }

}
