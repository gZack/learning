package mpp.quiz.prob1;

public class CD extends LendingItem {
	private String productId;
	private String title;
    private String company;

    public CD(final String productId, final String title, final String company){
        this.productId = productId;
        this.title = title;
        this.company = company;
    }

    @Override
    public boolean equals(Object obj) {

        CD oCD = null;

        if (obj instanceof CD){
            oCD = (CD) obj;
        }

        if (oCD == null){
            return false;
        }

        if(oCD.productId == this.productId
                && oCD.company == this.company
                && oCD.title == this.title){
            return true;
        }
        return false;
    }
	
}
