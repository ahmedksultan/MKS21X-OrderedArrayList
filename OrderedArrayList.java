import java.util.ArrayList;
import java.util.List;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
     public OrderedArrayList() {
          super(0);
     }
     public OrderedArrayList(int startingCapacity) {
          super(startingCapacity);
     }
     public boolean add(T element) {
          if (element == null) {
               throw new IllegalArgumentException("**ERROR - cannot add null");
          }
          for (int i = 0; i < size(); i++) {
               if (element.compareTo(get(i)) <= 0) {
                    super.add(i, element);
                    return true;
               }
          }
          return super.add(element);
     }
     public void add(int index, T element) {
          if (element == null) {
               throw new IllegalArgumentException("**ERROR - cannot add null");
          }
          add(element);
     }
     public T set(int index, T element) {
          if (element == null) {
               throw new IllegalArgumentException("**ERROR - cannot set null");
          }
          T removed = remove(index);
          add(element);
          return removed;
     }
}
