
public class HealthStation {

    private int number;
    
    public HealthStation(){
        this.number = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.number++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings(){
        return number;
    }

}
