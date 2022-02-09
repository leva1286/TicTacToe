import java.util.Scanner;

public class Main {

    public static PlayingField  buildField() {

        PlayingField field = new PlayingField("The move of the cross");
        return field;
    }

    public static void main(String[] args) {

        PlayingField field = buildField();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы сходить вам надо ввести координаты точки пример: 'move 1 1'");
        System.out.println();
        field.printField();
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("exit") || s.equals("No")) break;
            else if (s.equals("replay") || s.equals("Yes")) {
                System.out.println("Заново");
                field = buildField();
                field.printField();
            }else {
                if (s.contains("move")) {
                    String[] a = s.split(" ");
                    try {
                        int line = Integer.parseInt(a[1]);
                        int column = Integer.parseInt(a[2]);
                        if (field.moveToPosition(line,column)) {
                            System.out.println("Ход сделан успешно");
                            if (field.isVictory()) {
                                System.out.println("Поздравляю вы победили");
                                field.printField();
                                System.out.println("Хотите сыграть еще раз? ");
                                System.out.println("'Yes' or 'No'");
                            } else field.printField();
                        } else System.out.println("Не удалось сделать ход");
                    } catch (Exception e) {
                        System.out.println("Вы что-то ввели не так, попробуйте еще раз");
                    }
                }
            }
        }
    }
}
