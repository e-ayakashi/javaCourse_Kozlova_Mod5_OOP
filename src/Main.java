import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scrType = new Scanner(System.in);
        Scanner scrName = new Scanner(System.in);
        int actionType = 0;
        Cat cat = new Cat(null, 1, null, null);
        Raccoon raccoon = new Raccoon(null, 2);

        System.out.println("Выбери домашнего питомца, введя число: 1 - кот; 2 - енот");
        int type = scrType.nextInt();

        switch (type) {
            case 1:
                cat.askName();
                String nameCat = scrName.nextLine();
                cat.setNamePet(nameCat);
                cat.imgPets();
                cat.hello();
                System.out.println(cat.getDescription());
                break;
            case 2:
                raccoon.askName();
                String nameRaccoon = scrName.nextLine();
                raccoon.setNamePet(nameRaccoon);
                raccoon.imgPets();
                raccoon.hello();
                System.out.println(raccoon.getDescription());
                break;
        }

        System.out.println("\n Выбирай, что питомец будет делать дальше:\n 1. Поест\n 2. Будет тыгыдыкать\n 3. Пусть делает, что хочет\n 4.Остановите Землю, я сойду");

        while (actionType != 4) {
            actionType = scrType.nextInt();
            switch (type) {
                case 1:
                    cat.action(actionType);
                    break;
                case 2:
                    raccoon.action(actionType);
                    break;
                }
            if (actionType != 4) {
                System.out.println("Что дальше?");
            }
        }
            System.out.println("Пока!");
    }
}
