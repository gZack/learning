package mpp.standard.PracticeForStandard2017July.prob2;

public class CD extends LendingItem {
	private String productId;
	private String title;
	private String company;

	public CD(final String productId, final String title, final String company){
	    this.company = company;
	    this.title = title;
	    this.productId = productId;
    }


	public String getTitle() {
		return title;
	}

	public String getProductId() {
		return productId;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CD)){
			return false;
		}

		CD o = (CD) obj;

		return this.getTitle().equals(o.getTitle())
				&& this.getCompany().equals(o.getCompany())
				&& this.getProductId().equals(o.getProductId());
	}
}
