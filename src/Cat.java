public class Cat extends Pets{

    private String secretAction;
    private String description;

    public Cat(String namePet, int typePet, String secretAction, String description){
        super(namePet,typePet);
        this.secretAction = "Я так и не нашел рыбов, поэтому разбудил тебя в 5 утра, чтобы ты мне помог с этим. Иди порыбачь!";
        this.description = "Тебе достался кот дворянских кровей, который страдает рыбной зависимостью. Прошлые хозяева долго не кормили его рыбкой - их больше никто не видел...";
    }

    public Cat (){

    }

    @Override
    public void askName() {
        System.out.println("Что может быть лучше мягкого кота? Именно! Ничего! ^_^/ \nКак зовут твоего котейку?");
    }

    @Override
    public void imgPets() {
        String name = super.getNamePet();
        System.out.printf("Добро пожаловать домой, %s!\n", name);
        System.out.println("   |\\_._/|\n   | oYo |\n  ( = T = )\n  .^`-^-'^.\n  `.  ;  .'\n  | | | | |\n ((_((|))_))");
    }

    @Override
    public void hello() {
        System.out.println("Рыбов есть? А если найду?");
    }

    @Override
    public void action(int typeAction) {
        switch (typeAction){
            case 1:
                System.out.println("Я не нашел рыбов, поэтому съел твою котлету");
                System.out.println(" /\\_/\\\n( o.o )\n > ^ <");
                break;
            case 2:
                System.out.println("Нет рыбов - нет тыгыдыков");
                System.out.println("    |\\__/,|   (`\\\n  _.|o o  |_   ) )\n-(((---(((--------");
                break;
            case 3:
                System.out.println(secretAction);
                System.out.println("    /\\_/\\           ___\n   = oYo =_______    \\ \\\n    __^      __(  \\.__) )\n(@)<_____>__(_____)____/");
                break;
        }

    }
    public String getDescription() {
        return description;
    }
}
