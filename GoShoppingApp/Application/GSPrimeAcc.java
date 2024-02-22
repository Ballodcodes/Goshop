package Application;

import Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    public void bookProduct(float charges) {
        if(isPrime()) {
            System.out.println("Price of Book Product is: " + charges);
            System.out.println("Delivery charges of Book Product is: " + getdeliveryCharges());
            System.out.println("Total Amount : "+(charges + getdeliveryCharges()));
        }else{
            System.out.println("Price of Book Product is: " + charges);
            System.out.println("Delivery charges of Book Product is: " + 80.0);
            System.out.println("Total Amount : "+(charges + 80.0));
        }
    }

    @Override
    public String toString() {
        return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }
}