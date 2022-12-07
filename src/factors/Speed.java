package factors;

public enum Speed {
    SLOWLY("неспеша"),
    CALMLY("спокойно"),
    QUICKLY("быстро");

    private final String str;

    Speed(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
