package isuru.enums;

public enum Temperature {
    High (3),Medium (2), Low (1);
    private final int level;
    Temperature(int level) {
        this.level=level;
    }

    public int getLevel() {
        return level;
    }
}
