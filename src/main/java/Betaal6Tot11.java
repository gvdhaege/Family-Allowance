public class Betaal6Tot11 implements BetaalInt {

    @Override
    public int betaalUit(int aantalKeerUitbetaald) {
        int uitbetaling;
        switch (aantalKeerUitbetaald) {
            case 1:
                uitbetaling = 1604;
                break;
            default:
                uitbetaling = 3199;
                break;
        }
        return uitbetaling;
    }
}
