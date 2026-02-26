import java.util.ArrayList;

/**
 * @(#)Farm.java
 *  Create an Array List of Animals
 *  Populate it with various types of Animals
 *  Polymorphism - ta daaa
 * 
 * @author Mr. Leohr
 * @version 1.00 2026/2/25
 */


public class Farm {

    public static void main(String[]rags) {
    	Cow moo = new Cow();
        Pig oinkers = new Pig();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(moo);
        animals.add(oinkers);

        for(int i=0; i<55; i++)
        {
            oinkers.eat();
            moo.eat();

            if(moo.equals(moo))
            {
                if(moo.getAge()==50)
                {
                    moo.kill();
                    System.out.println("Animal moo died at age " + moo.getAge());
                }
            }

            if(oinkers.equals(oinkers))
            {
                if(oinkers.getAge()==50)  
                {
                    oinkers.kill();
                    System.out.println("Animal oinkers died at age " + oinkers.getAge());
                }   
            }   
        }
        System.out.println("done");

    }


}