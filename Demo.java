public class Demo {
     public static void main(String[] args) {
          NoNullArrayList<String> smashbros = new NoNullArrayList<>();
          smashbros.add("mario");
          smashbros.add("luigi");
          smashbros.add("ness");
          smashbros.add("pikachu");
          smashbros.add(1, "incineroar");
          System.out.println(smashbros); // [mario, incineroar, luigi, ness, pikachu]
     }
}
