public abstract class Pets {
    private String namePet;
    private int typePet;

    public Pets(String namePet, int typePet) {
        this.namePet = namePet;
        this.typePet = typePet;
    }

    protected Pets() {
    }

    public String getNamePet() {

        return namePet;
    }

    public void setNamePet(String namePet) {

        this.namePet = namePet;
    }

    public void setTypePet(int typePet) {

        this.typePet = typePet;
    }

    public abstract void askName();
    public abstract void imgPets();
    public abstract void hello();
    public void action(int typeAction){
        }
}
