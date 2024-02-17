import bibliothek.Book;
import bibliothek.CourseBook;

public class Main {

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int add(float n1, float n2) {
        System.out.println("You called the float version");
        return (int)(n1 + n2);
    }


    /**
     * This is a much longer comment
     * @param args
     */
    public static void main(String[] args) {

        Book.lengthOfISBN();
        System.out.println(Book.totalBooks);

        float a = 1;
        float b = 0;

        add(a,b);


        Book c = new CourseBook("Java is A LOT of fun");
        System.out.println(c.getTitle());

        System.out.println(Book.totalBooks);





    }
}