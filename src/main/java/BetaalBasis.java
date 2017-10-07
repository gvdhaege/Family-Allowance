public class BetaalBasis implements BetaalInt {

    @Override
    public int betaalUit(int aantalKeerUitbetaald) {
        int uitbetaling;
        switch (aantalKeerUitbetaald){
            case 1: uitbetaling = 9209;
            break;
            case 2: uitbetaling = 17039;
            break;
            default : uitbetaling = 25440;
            break;
        }
        return uitbetaling;
    }
}
