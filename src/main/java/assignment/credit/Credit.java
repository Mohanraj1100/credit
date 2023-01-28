package assignment.credit;
import java.util.*;
public class Credit 
{
	public static void main(String[] args) {
        Scanner si = new Scanner(System.in);

        System.out.println("Enter cardholder name");
        String cardholder = si.nextLine();
        System.out.println("Enter cardnumber");
        Long cardnumber = si.nextLong();
        System.out.println("Enter card's expiry daate");
        String expirydate = si.next();

        Long validcardno = 987654321l;

        Creditcard obj1 = new Creditcard(cardholder, cardnumber, expirydate);
        Creditcard obj2 = obj1.co();
        System.out.println(obj2.equals(validcardno));
	obj2.display();
    }

}
