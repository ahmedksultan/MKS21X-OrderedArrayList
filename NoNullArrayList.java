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
          return super.add(element);
     }
     public void add(int index, T element) {
          if (element == null) {
               throw new IllegalArgumentException("**ERROR - cannot add null");
          }
          super.add(index, element);
     }
     public T set(int index, T element) {
          if (element == null) {
               throw new IllegalArgumentException("**ERROR - cannot add null");
          }
          return super.set(index, element);
     }
}
