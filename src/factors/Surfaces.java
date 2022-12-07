package factors;

public enum Surfaces {
    FLOOR("пол"),
    STREET("улица");
    private final String str;

    Surfaces(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
