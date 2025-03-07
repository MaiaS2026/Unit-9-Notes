public class Main {

   public static void main(String []args) {
      // Use the default/no-arg constructors
      Vehicle v1 = new Vehicle();
      Car c1 = new Car();
      // Use the parameterized constructors
      // ORDER of arguments must match formal params!!!
      Vehicle v2 = new Vehicle(3, 10.0, "Blue");
      Car c2 = new Car(4, 65.0, "Navy Blue", 5, "Mercedes Convertible"); 


   }
}
