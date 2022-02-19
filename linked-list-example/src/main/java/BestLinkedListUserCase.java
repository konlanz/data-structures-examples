import java.util.LinkedList;

public class BestLinkedListUserCase {
    //an example is a shopping card; because the shopping card can grow and shrink at any point depending on the
    // user's preferences it's best to use a Linked list to hold the items.
    public static void main(String[] args) {

        LinkedList<String> shoppingCartList = new LinkedList<>();
        shoppingCartList.add("laptop");
        shoppingCartList.add("late");
        shoppingCartList.add("TV");
        shoppingCartList.add("Book");
        System.out.println(shoppingCartList);

        shoppingCartList.removeLast();
        System.out.println(shoppingCartList);
    }


}
