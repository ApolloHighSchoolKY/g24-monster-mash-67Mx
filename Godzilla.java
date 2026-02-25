public class Godzilla extends Monster{
    public Godzilla(String name){
        super(name);
    }

    public String kill(){
        return getName() + " burned a victim to death with atomic breath \n";
    }

    public String stomp(){
        return getName() + " stomped a city block to rubble \n";
    }
}
