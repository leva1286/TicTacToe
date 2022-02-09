public class PlayingField {

    public Sign[][] field = new Sign[3][3];

    private int strokeNumber = 1;
    private String nowPlayer;

    public PlayingField(String nowPlayer) {
        this.nowPlayer = nowPlayer;
    }

    public boolean moveToPosition(int startLine, int startColumn) {
        if (field[startLine][startColumn] == null && strokeNumber % 2 == 1) {
            field[startLine][startColumn] = new Cross();
            this.nowPlayer = "Zero stroke";
            strokeNumber++;
            return true;
        } else if (field[startLine][startColumn] == null && strokeNumber % 2 == 0) {
            field[startLine][startColumn] = new Zero();
            this.nowPlayer = "The move of the cross";
            strokeNumber++;
            return true;
        }
        return false;
    }

    public void printField() {
        System.out.println(nowPlayer);
        System.out.println();
        System.out.println("\t0\t1\t2");
        for (int i = 2; i > -1; i--) {
            System.out.print(i + "\t");
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == null) {
                    System.out.print(".." + "\t");
                } else System.out.print(field[i][j].getSymbol() + "\t");
            }
            System.out.print(i + "\t");
            System.out.println();
            System.out.println();
        }
        System.out.println("\t0\t1\t2");
    }

    public boolean isVictory() {
        if (field[0][0] != null && field[1][0] != null && field[2][0] != null) {
            if (field[0][0].getSymbol().equals(field[1][0].getSymbol()) && field[1][0].getSymbol().equals(field[2][0].getSymbol())) {
                return true;
            }
        } else if (field[0][1] != null && field[1][1] != null && field[2][1] != null) {
            if (field[0][1].getSymbol().equals(field[1][1].getSymbol()) && field[1][1].getSymbol().equals(field[2][1].getSymbol()))
                return true;
        } else if (field[0][2] != null && field[1][2] != null && field[2][2] != null) {
            if (field[0][2].getSymbol().equals(field[1][2].getSymbol()) && field[1][2].getSymbol().equals(field[2][2].getSymbol()))
                return true;
        } else if (field[0][0] != null && field[0][1] != null && field[0][2] != null) {
            if (field[0][0].getSymbol().equals(field[0][1].getSymbol()) && field[0][1].getSymbol().equals(field[0][2].getSymbol())) {
                return true;
            }
        } else if (field[1][0] != null && field[1][1] != null && field[1][2] != null) {
            if (field[1][0].getSymbol().equals(field[1][1].getSymbol()) && field[1][1].getSymbol().equals(field[1][2].getSymbol()))
                return true;
        } else if (field[2][0] != null && field[2][1] != null && field[2][2] != null) {
            if (field[2][0].getSymbol().equals(field[2][1].getSymbol()) && field[2][1].getSymbol().equals(field[2][2].getSymbol()))
                return true;
        } if (field[2][0] != null && field[1][1] != null && field[0][2] != null) {
            if (field[2][0].getSymbol().equals(field[1][1].getSymbol()) && field[1][1].getSymbol().equals(field[0][2].getSymbol()))
                return true;
        } else if (field[0][0] != null && field[1][1] != null && field[2][2] != null) {
            if (field[0][0].getSymbol().equals(field[1][1].getSymbol()) && field[1][1].getSymbol().equals(field[2][2].getSymbol()))
                return true;
        }
        if (field[0][0] != null && field[0][1] != null && field[0][2] != null &&
                field[1][0] != null && field[1][1] != null && field[1][2] != null &&
                field[2][0] != null && field[2][1] != null && field[2][2] != null) {
            System.out.println("У вас ничья");
        }
        return false;

    }
}
