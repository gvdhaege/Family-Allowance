import org.junit.Test;

public class KindergeldTest {

    @Test
    public void eenKindLeeftijd0_Krijgt92_09(){
        Kind testKind = new Kind(0);
        Uitbetaler uitbetaler = new Uitbetaler();
        double expected = 92.09;

        assertThat(uitbetaler.betaalTotaalKindergeld()).isEqualTo(92.09);
    }

    @Test
    public void eenTweedeKindLeeftijd0_Krijgt170_39(){
        Kind testKind = new Kind(0);
        Uitbetaler uitbetaler = new Uitbetaler();
        double expected = 170.39;
        uitbetaler.betaalTotaalKindergeld();

        assertThat(uitbetaler.betaalTotaalKindergeld()).isEqualTo(expected);
    }

    @Test
    public void eenAchtsteKindLeeftijd0_Krijgt254_40(){
        Kind testKind = new Kind(0);
        Uitbetaler uitbetaler = new Uitbetaler();
        double expected = 254.40;
        for (int i=0;i<7; i++){
        uitbetaler.betaalTotaalKindergeld();}

        assertThat(uitbetaler.betaalTotaalKindergeld()).isEqualTo(expected);
    }

}
