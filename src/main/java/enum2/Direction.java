package enum2;

public enum Direction {
    NORTH("północ"),
    SOUTH("południe"),
    EAST("wschód"),
    WEST("zachód");

    private String directionInPolish;

    Direction(String direction) {
        this.directionInPolish = direction;
    }

    public String getDirectionInPolish() {
        return directionInPolish;
    }
}
