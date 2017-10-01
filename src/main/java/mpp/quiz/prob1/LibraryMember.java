package mpp.quiz.prob1;

import java.util.Optional;

public class LibraryMember {
	private String memberId;
	private String lastName;
	private String firstName;
	private String phone;
    private CheckoutRecord checkoutRecord;

	public LibraryMember(String memberId, String firstName,
                         String lastName, String phone){
	    this.memberId = memberId;
	    this.lastName = lastName;
	    this.firstName = firstName;
	    this.phone = phone;
    }

    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }

    public String getFirstName() {
        return firstName;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getPhone() {
        return phone;
    }


    /**
     * added for personal test
     * @param item
     * @return
     */
    public boolean contains(LendingItem item){

        Optional<LendingItem> itesm = checkoutRecord.getCheckoutRecordEntries().stream()
                .filter(m -> m.getLendingItem().equals(item))
                .map(m->m.getLendingItem())
                .findFirst();

        return itesm.isPresent();
    }

}
