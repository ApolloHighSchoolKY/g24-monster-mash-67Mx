public class Pig extends Animal {
    private int baconProduced;

    public Pig()
    {
        super.sound("Oink");
    }

    public void eat(){
        super.eat(1);
        baconProduced++;
    }

    public String toString()
    {
        return super.toString();
    }
}
