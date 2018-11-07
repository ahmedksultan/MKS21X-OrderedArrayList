public class Demo {
     public static void main(String[] args) {
          System.out.println("\nCreating new NoNullArrayList...Complete!");
          NoNullArrayList<String> smashbros = new NoNullArrayList<>();
          System.out.println("Adding items to new list...");
          smashbros.add("mario");
          smashbros.add("luigi");
          smashbros.add("ness");
          smashbros.add("pikachu");
          System.out.println("Adding item to index one of list...");
          smashbros.add(1, "incineroar");
          System.out.println("...Complete! Printing list...\n\texpected output: [mario, incineroar, luigi, ness, pikachu]");
          System.out.println("\tprinted  output: " + smashbros); // [mario, incineroar, luigi, ness, pikachu]
          System.out.println("\nReplacing item at index one of list...");
          smashbros.set(1, "king k rool");
          System.out.println("...Complete! Printing list...\n\texpected output: [mario, king k rool, luigi, ness, pikachu]");
          System.out.println("\tprinted  output: " + smashbros);// [mario, king k rool, luigi, ness, pikachu]
          System.out.println();
          System.out.println("\nCreating new OrderedArrayList...Complete!");
     }
}
