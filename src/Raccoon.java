public class Raccoon extends Pets{

    private String secretAction;
    private String description;

    public Raccoon(String namePet, int typePet){
        super(namePet,typePet);
        this.secretAction ="Я стащил все твои носки и распотрошил мусорное ведро, чтобы ты не расслаблялся";
        this.description ="Тебе достался енот-полоскун. Хитер, умен, настойчив. Бесится, когда его сравнивают с котами. Будь аккуратнее.";
    }

    public Raccoon () {

    }

    @Override
    public void askName() {
        System.out.println("Хмм, ты уверен? Ну ладно, любитель сюрпризов. \nИ как же величать твоего енота?");
    }

    @Override
    public void imgPets() {
        String name = super.getNamePet();
        System.out.printf("Добро пожаловать домой, %s!\n", name);
        System.out.println("\n      /\\_/\\\n     -<@ @>-\n \\|/---~.~---\\|/\n  o --     -- o\n   ---     ---\n \\|/---------\\|/\n  o  -------  o )))))))))>");
    }

    @Override
    public void hello() {
        System.out.println("Привет, кожаный!");
    }

    @Override
    public void action(int typeAction) {
        switch (typeAction) {
            case 1:
                System.out.println("Ом-ном-ном, неси еще!");
                System.out.println(" _._     _,-'\"\"`-._\n<,-.`._,'(       |\\`-/|\n    `-.-' \\ )-`- -<@ @>-\n          `-    \\`_`.'-");
                break;
            case 2:
                System.out.println("Ты совсем попутал, кожаный? Я что, кот по-твоему?");
                System.out.println("                       ,,,\n                     .'    `/\\_/\\\n                   .'       <@Y@>\n        <((((((((((  )____(  \\./\n                   \\( \\(   \\(\\(\n                    `-\"`-\"  \" \"\n          Укусил тебя за пятку");
                break;
            case 3:
                System.out.println(secretAction);
                System.out.println("                       ,,,\n                     .'    `/\\_/\\\n                   .'       <@ @>\n        <((((((((((  )____(  \\./\n                   \\( \\(   \\(\\(\n                    `-\"`-\"  \" \"\n          хе-хе-хе");
                break;
        }
    }
    public String getDescription() {
        return description;
    }
}
