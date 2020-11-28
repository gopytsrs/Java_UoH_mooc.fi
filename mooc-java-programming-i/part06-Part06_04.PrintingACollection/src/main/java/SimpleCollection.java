
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
//    @Override
//    public String toString(){
//        if(elements.isEmpty()){
//            return String.format("The collection %s is empty.",this.name);
//        }
//        
//        String output = "";
//        
//        if(this.elements.size() == 1){
//            output += this.elements.get(0) + "\n";
//            return String.format("The collection %s has 1 element:\n",this.name) + output;
//        } else {
//            for(String element: elements){
//                output += String.format("%s\n",element);
//            }
//            return String.format("The collection %s has %d elements:\n",this.name,this.elements.size()) + output;
//        }
//    }
    @Override
        public String toString() {
        String output = "The collection " + this.name;
        String elementsAsString = "";
        if (this.elements.isEmpty()) {
            return output + " is empty.";
        } else if (this.elements.size() == 1) {
            return output + " has " + this.elements.size() + " element:" + "\n" + this.elements.get(0);
        } else {
            for (String element : elements) {
                elementsAsString = elementsAsString+element + "\n";
            }
            return output + " has " + this.elements.size() + " elements:" + "\n" + elementsAsString;
        }

    }
    
}
