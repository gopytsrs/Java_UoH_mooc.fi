
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int greatest = number1;
        int [] array = {number1,number2,number3};
        for(int i=0; i<array.length;i++){
            if(array[i] > greatest){
                greatest = array[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
