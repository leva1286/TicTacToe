public abstract class Sign {

    private String symbol;

    public Sign(String symbol) {
        this.symbol = symbol;
    }

    public abstract boolean canMoveToPosition(PlayingField playingField, int line, int column);

    public abstract String getSymbol();
}
