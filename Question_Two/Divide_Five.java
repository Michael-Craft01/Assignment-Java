// functionality: uses stream api to filter numbers divible by 5
import java.util.*; //arraylist
import java.util.stream.Stream; //stram api

public class Divide_Five{
    public static void main(String[] args){
        // step1: create arraylist with numbers
        List<Integer> numbers = Arrays.asList(1,4,5,20,30,6);

        // step2: use stream to filter numbers divible by 5
        List<Integer> Divide_Five = numbers.stream()
        .filter(n-> n% 5 ==0) //keep numbers divible by 5 only
        .collect(Collectors.toLIst()) //collect results into a new list

        // step3 : print results
        System.out.println("Numbers divible by 5"+ Divide_Five);
        
    }
}