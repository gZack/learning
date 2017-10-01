package mpp.standard.PracticeForStandard2017July.prob2;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;

	public Book(final String isbn, final String title,
                final String authorLastName, final String authorFirstName){
	    this.isbn = isbn;
	    this.title =title;
	    this.authorFirstName = authorFirstName;
	    this.authorLastName = authorLastName;
    }

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public boolean equals(Object obj) {

		if(!(obj instanceof Book)){
			return false;
		}

		Book o = (Book) obj;

		return o.getIsbn().equals(getIsbn()) && o.getTitle().equals(getTitle())
				&& o.getAuthorFirstName().equals(getAuthorFirstName())
				&& o.getAuthorLastName().equals(getAuthorLastName());
	}
}
