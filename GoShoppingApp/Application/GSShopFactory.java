package Application;

import Framework.ShopFactory;
import Framework.PrimeAcc;
import Framework.NormalAcc;

public class GSShopFactory extends ShopFactory {

    @Override
    public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
        PrimeAcc primeacc = new GSPrimeAcc(accNo, accNm, charges, isPrime);
        return primeacc;
    }

    @Override
    public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
        GSNormalAcc normalacc = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
        return normalacc;
    }

}
