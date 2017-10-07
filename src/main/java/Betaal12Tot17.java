public class Betaal12Tot17 implements BetaalInt {

    @Override
    public int betaalUit(int aantalKeerUitbetaald) {
        int uitbetaling;
        switch (aantalKeerUitbetaald) {
            case 1:
                uitbetaling = 2443;
                break;
            default:
                uitbetaling = 4888;
                break;
        }
        return uitbetaling;
    }
}
