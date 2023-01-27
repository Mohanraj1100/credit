package assignment.credit;

public class Creditcard implements cloneable{
    String cardholder;
    Long cardnumber;
    String expirydate;

    Creditcard(String cardholder, Long cardnumber, String expirydate) {
        this.cardholder = cardholder;
        this.cardnumber = cardnumber;
        this.expirydate = expirydate;
    }

    boolean equals(Long validcardno) {
        return cardnumber.equals(validcardno);
    }

    void display() {
        System.out.println("Cardholder nsme id" + cardholder + "and card Number id " + cardnumber + "And expiry date"
                + expirydate);
    }

    Creditcard co() {
    	try{
    		return (Creditcard)super.clone();
    		
    	}
    	catch(CloneNotSupportedException e)
    	{
    		System.out.println("Clowning error");
    		return this;
    	}
}
}
