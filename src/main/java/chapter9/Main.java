package chapter9;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       /* Employee employee = new Employee();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        rectangle.print();
        square.print("Square");

        */
        Mother mom = new Mother();
        mom.setName("Diane");

        System.out.println(mom.getName() + " is a " + mom.getGender());


    }
}