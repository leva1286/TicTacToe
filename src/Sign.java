public abstract class Sign {

    String symbol;

    public Sign(String symbol) {
        this.symbol = symbol;
    }

    public abstract boolean canMoveToPosition(PlayingField playingField, int line, int column);

    public abstract String getSymbol();
}
