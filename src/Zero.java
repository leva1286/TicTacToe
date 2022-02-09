public class Zero extends Sign {
    public Zero() {
        super("Zero");
    }

    @Override
    public boolean canMoveToPosition(PlayingField playingField, int line, int column) {
        return playingField.field[line][column] == null;
    }

    @Override
    public String getSymbol() {
        return "O";
    }
}
