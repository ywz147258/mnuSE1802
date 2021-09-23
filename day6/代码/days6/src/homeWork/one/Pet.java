package homeWork.one;

public abstract class Pet {
    private String food;

    public String getFood() {
        return food;
    }

    public Pet(String food){
        this.food=food;
    }

    public abstract void eat();
}
