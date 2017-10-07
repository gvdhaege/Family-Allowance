public class BetaalWerkloosOfGepensioneerd {
    int aantalKinderen = 1;
    boolean single = WerkloosOfGepensioneerdRechthebbende.getSingle();

    public int betaalWerkloosOfGepensioneerd(boolean werkloosOfGepensioneerd) {
        if (werkloosOfGepensioneerd) {
            if (aantalKinderen < 2) {
                aantalKinderen++;
                return 4688;
            } else if (aantalKinderen < 3) {
                aantalKinderen++;
                return 2906;
            } else if (single) {
                return 2343;
            }

        }
        return 510;
    }
}
