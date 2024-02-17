package bibliothek;

public class CourseBook extends Book {

    public CourseBook(String aTitle) {
            this.title = aTitle;
            totalBooks = totalBooks + 1;
    }

    @Override
    public String getAuthor() {
        return null;
    }
}
