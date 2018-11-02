import java.util.ArrayList;
import java.util.List;

public class NoNullArrayList<T> extends ArrayList<T> {
     public NoNullArrayList() {
          super(0);
     }
     public NoNullArrayList(int size) {
          super(size);
     }
     public boolean add(T element) {
          if (element == null) {
               throw new IllegalArgumentException("**ERROR - cannot add null");
          }
          super.add(element);
          return true;
     }
     public void add(int index, T element) {
          if (element == null) {
               throw new IllegalArgumentException("**ERROR - cannot add null");
          }
          super.add(index, element);
     }
     /* NoNullArrayList is an ArrayList of T that cannot take a null as a value.

    Override set and both add methods -> throw an IllegalArgumentException when null is added,
                                       otherwise call the old add method.

    Only have 2 constructors:  default + startingCapacity. */
}
