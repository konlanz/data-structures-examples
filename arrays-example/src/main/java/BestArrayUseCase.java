import java.util.Arrays;
import java.util.Locale;


public class BestArrayUseCase {
    //this is the use case I came up with.
    //Let's say an array of name, If you want to Capitalize the names. The best data structure to use is an array.
    public static void main(String[]args){
        String[] strAr2 = {"Aisha", "Konlan", "Joe", "kofi", "Emma"};
        arrayToUpperCase(strAr2);

    }

    public static void arrayToUpperCase(String[] array){
        Arrays.stream(array).map(item->item.toUpperCase()).forEach(item->System.out.println(item+ " "));
    }


}
