public class Main
{

    public static void main(String[] args)
    {
	int creditCardBalance = 5000;
    double INTEREST_RATE = 0.17;
    double interestFirstMonth = creditCardBalance * INTEREST_RATE;
    double interestSecondMonth = INTEREST_RATE * interestFirstMonth + interestFirstMonth;
        System.out.println("the interest due after one month is: " + interestSecondMonth + " and the interest due after two month is: " + interestSecondMonth);
    }
}
