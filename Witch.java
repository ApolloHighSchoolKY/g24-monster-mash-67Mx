public class Witch extends Monster{
    public Witch(String name){
        super(name);
    }

    //Override kill
    public String kill(){
        if(getName().equals("Sally"))
            return "Sally eviserated her victims by showing her ugly face \n";
        return getName() + "burned a victim to death with her acid potion \n";

    }

    public String fly(){
        return getName() + " went flying and cackling on her broomstick \n";
    }
}
