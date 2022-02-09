public class Cross extends Sign {


    public Cross() {
        super("Cross");
    }

    @Override
    public boolean canMoveToPosition(PlayingField playingField, int line, int column) {
        return playingField.field[line][column] == null;
    }

    @Override
    public String getSymbol() {
        return "X";
    }
}
