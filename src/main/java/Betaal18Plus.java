public class Betaal18Plus implements BetaalInt {

    @Override
    public int betaalUit(int aantalKeerUitbetaald) {
        int uitbetaling;
        switch (aantalKeerUitbetaald) {
            case 1:
                uitbetaling = 2816;
                break;
            default:
                uitbetaling = 6215;
                break;
        }
        return uitbetaling;
    }
}
