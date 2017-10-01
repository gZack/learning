package mpp.standard.PracticeForStandard2017July.prob2;

public class LibraryMember {
    private String memberId;
    private String firstName;
    private String lastName;
    private String phone;
    private CheckoutRecord checkoutRecord;

    public LibraryMember(final String memberId, final String firstName,
                         final String lastName, final String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
        this.phone = phone;
    }


    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    public String getPhone() {
        return phone;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
