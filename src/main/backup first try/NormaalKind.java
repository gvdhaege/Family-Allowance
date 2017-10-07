public class NormaalKind implements Kind, BetaalLeeftijdToelage {
    int leeftijd;
    int positie;

    public NormaalKind(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    @Override
    public int getLeeftijd() {
        return leeftijd;
    }


    @Override
    public int leeftijdCheck() {
        return 0;
    }
}
