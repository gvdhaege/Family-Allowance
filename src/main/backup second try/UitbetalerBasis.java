public class UitbetalerBasis implements UitbetaalInterface {

    public int betaalUit(int aantalKeerUitbetaald) {
        int basisPositie;
        switch (aantalKeerUitbetaald) {
            case 1:
                basisPositie = 0;
                break;
            case 2:
                basisPositie = 1;
                break;
            default:
                basisPositie = 2;
                break;
        }
        return basisPositie;

    }
}
