import java.util.ArrayList;
import java.util.List;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
     /* This is a NoNullArrayList that maintains all elements in a sorted order upon insertion.

    Override both add methods -> find the correct index where the new element should be added,
                                 then insert the new element into that position
                                 (hint: 1)compareTo 2) helper method)

    Override set(index,value) -> remove the element at index, then add the new value.

    Only have 2 constructors:  default + startingCapacity. */
}
