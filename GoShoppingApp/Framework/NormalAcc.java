package Framework;

public abstract class NormalAcc extends ShopAcc {
    private final float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    public float getdeliveryCharges() {
        return deliveryCharges;
    }

    public void bookProduct(float deliveryCharges) {

    }

    @Override
    public String toString() {
        return "NormalAcc [delivery charges =" + deliveryCharges + "]";
    }
}
