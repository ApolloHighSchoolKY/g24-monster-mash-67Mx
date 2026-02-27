/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    private double milkProduced;

    public Cow()
    {
        super("Moo");
        milkProduced=0;
    }

    public void eat(){
        super.eat(1);
        milkProduced++;
    }

    public String speak()
    {
        return "The cow says " + ;
    }

    public String toString()
    {
        if(super.isAlive())_
        return super.toString() + "\nMilk Produced: " + milkProduced;
        return "cow lived to be " + super.getAge()+ " and produced "+ milkProduced+ " gallons of milk.";
    }


}