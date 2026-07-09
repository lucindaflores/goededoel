import java.math.BigDecimal;

public class GoedeDoel {

    private final String naam;
    private final BigDecimal opbrengst = BigDecimal.ZERO;

    public GoedeDoel(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public BigDecimal getOpbrengst() {
        return opbrengst;
    }


}