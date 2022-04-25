import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String userInput = null;

        CustomCollection collection = new CustomCollection(3);

        while (!salir) {
            System.out.println("Introduzca un nombre o pulse Q para salir");
            userInput = sc.nextLine();

            if (userInput.equals("Q")) {
                salir = true;
            } else {
                collection.insert(userInput, 0);
            }

            String aux;

            for (int i = 0; i < collection.length(); i++) {
                aux = (String) collection.getElement(i);
                System.out.println(i + " - " + aux);

            }*/
        /*GenericCollection collection = new GenericCollection<Integer>(3);
        System.out.println(collection);
        collection.add(1);
        collection.add(1);
        collection.add(1);
        collection.add(1);
        System.out.println(collection);*/

        GenericStack <String>miPila = new GenericStack<String>();
        miPila.push("El Quijote");
        miPila.push("Padre rico, padre pobre");
        miPila.push("Cisne negro");
        String libro = miPila.pop();
        System.out.println(libro);
    }
}
