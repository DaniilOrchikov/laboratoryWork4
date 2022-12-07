package factors;

public enum HealthStatus {
    RECOVERING("выздоравливает"),
    WITHOUTCHANGES("без изменений"),
    GETTINGWORSE("становится хуже");

    private final String str;

    HealthStatus(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
