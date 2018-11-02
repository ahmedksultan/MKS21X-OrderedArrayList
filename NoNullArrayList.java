public class NoNullArrayList<T> extends ArrayList<T> {
     /* NoNullArrayList is an ArrayList of T that cannot take a null as a value.

    Override set and both add methods -> throw an IllegalArgumentException when null is added,
                                       otherwise call the old add method.

    Only have 2 constructors:  default + startingCapacity. */
}
