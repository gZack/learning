package mpp.quiz.prob1;

public class Book extends LendingItem {

    private String isbn;
    private String title;
    private String authorFirstName;
    private String authorLastName;


    public Book(final String isbn, final String title, final String authorFirstName,
                final String authorLastName){
        this.isbn = isbn;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;

    }

    @Override
    public boolean equals(Object obj) {

        Book otherBook = null;

        if(obj instanceof Book){
            otherBook = (Book) obj;
        }

        if(otherBook == null){
            return false;
        }

        if(otherBook.authorLastName == this.authorLastName
                && otherBook.authorFirstName == this.authorFirstName
                && otherBook.isbn == this.isbn
                && otherBook.title == title){
            return true;
        }
        return false;
    }

    /*public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }*/
}
