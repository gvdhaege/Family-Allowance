public class BetaalLeeftijdToelage extends Uitbetaler {
    int aantalKinderen;


    public int betaalLeeftijdToelage(int lftd) {
        if (lftd < 6) {
            if (aantalKinderen < 2) {
                aantalKinderen++;
                return 1604;
            } else
                aantalKinderen++;
            return 3199;
        }
        if (lftd < 12 && lftd > 5) {
            if (aantalKinderen < 2) {
                aantalKinderen++;
                return 2443;
            } else
                aantalKinderen++;
            return 4888;
        }
        if (lftd > 11 && lftd < 18) {
            if (aantalKinderen < 2) {
                aantalKinderen++;
                return 2816;
            } else
                aantalKinderen++;
            return 6215;
        }

        return 0;
    }
}
