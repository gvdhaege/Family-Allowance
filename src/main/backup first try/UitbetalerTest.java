import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UitbetalerTest {
    @Test
    public void NormaleRechthebbende_1KindLeeftijd6_11_Betaalt108_13() throws Exception {
        Kind testKind = new NormaalKind(6);
        Rechthebbende testRechthebbende = new NormaleRechthebbende();
        double expected = 108.13;
        double actual = testRechthebbende.betaalTotaal(testKind.getLeeftijd());

        assertThat(actual).isEqualTo(expected);

    }
    @Test
    public void NormaleRechthebbende_1KindLeeftijd12_17_Betaalt116_52() throws Exception {
        Kind testKind = new NormaalKind(13);
        Rechthebbende testRechthebbende = new NormaleRechthebbende();
        double expected = 116.52;
        double actual = testRechthebbende.betaalTotaal(testKind.getLeeftijd());

        assertThat(actual).isEqualTo(expected);

    }
    @Test
    public void NormaleRechthebbende_1KindLeeftijd18Plus_Betaalt120_25() throws Exception {
        Kind testKind = new NormaalKind(21);
        Rechthebbende testRechthebbende = new NormaleRechthebbende();
        double expected = 120.25;
        double actual = testRechthebbende.betaalTotaal(testKind.getLeeftijd());

        assertThat(actual).isEqualTo(expected);

    }
}