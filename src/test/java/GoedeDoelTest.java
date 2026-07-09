import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class GoedeDoelTest {

    private static final String NAAM = "CliniClowns";
    private GoedeDoel doel;

    @BeforeEach
    void beforeEach() {
        doel = new GoedeDoel(NAAM);
    }

    @Test
    void getNaam() {
        assertThat(doel.getNaam()).isEqualTo(NAAM);
    }

    // This test fails:
    @Test
    void eenNieuwDoelHeeftNogGeenOpbrengst() {
        assertThat(doel.getOpbrengst()).isZero();
    }

    @Test
    void doelenMetDezelfdeNaamZijnGelijk() {
        assertThat(doel).isEqualTo(new GoedeDoel(NAAM));
    }
    @Test
    void doelenMetVerschillendeNaamZijnVerschillend() {
        assertThat(doel).isNotEqualTo(new GoedeDoel("WWF"));
    }

}
