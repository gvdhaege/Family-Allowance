import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class UitbetaalTotaalTest {

    @Test
    public void eenKindLeeftijd0_Krijgt92_09() {
        UitbetaalTotaal test = new UitbetaalTotaal();
        double expected = 92.09;
        double actual = test.betaal();
        assertThat(expected).isEqualTo(actual);

    }

    @Test
    public void eenTweedeKindLeeftijd0_Krijgt170_39() {
        UitbetaalTotaal test = new UitbetaalTotaal();
        double expected = 170.39;
        test.betaal();
        double actual = test.betaal();
        assertThat(expected).isEqualTo(actual);

    }

    @Test
    public void eenAchtsteKindLeeftijd0_Krijgt254_40() {
        UitbetaalTotaal test = new UitbetaalTotaal();
        double expected = 254.40;
        for (int i = 0; i < 7; i++) {
            test.betaal();
        }
        double actual = test.betaal();
        assertThat(expected).isEqualTo(actual);

    }

}