/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is the original object that we are going to
 * create. All other objects will inherit all of the
 * properties and abilities this object has. In some cases,
 * we will override the existing methods we will create
 * here.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Animal
{
	private int age;
	private boolean alive;
	private String sound;

	    /**
	     * Create a new animal with age zero (a new born).
	     */
	    public Animal()
	    {
			age=0;
			alive=true;
			sound="noise";
	    }

	    /**
	    * Check whether the animal is alive or not.
	    * @return True if the animal is still alive.
	    */
        public boolean isAlive()
    	{
			return alive;
    	}

     	/**
     	* Make the animal die :(
     	*/
     	public void kill()
     	{
			alive=false;
     	}

     	/**
     	* Have the animal make a noise
     	* @return the string that is the animals sound it makes
     	*/
     	public String speak()
     	{
     		return ""+sound;
     	}

		public void sound(String noise)
		{
			sound=noise;
		}

		public void eat(int grassBlades)
		{
			age+=grassBlades;
		}

		public int getAge()
		{
		return age;
		}

		public boolean equals(Animal leohrbum)
		{
			if (leohrbum.getAge()==getAge() && leohrbum.speak().equals(sound))
				return true;
			return false;
		}

     	/**
     	* If you attempt to print the animal, if the animal is alive print its age and have it make
     	* a sound.  If the animal is dead, have it print how old it was when it died.
     	* @return String to be printed to the console.
     	*/
     	public String toString()
     	{	
			if(isAlive())
     		return "The animal is "+ age + " years old, is alive, and says" + sound;
			return "This diddy blud is dead";
     	}
}