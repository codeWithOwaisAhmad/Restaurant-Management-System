import java.util.Scanner;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
     RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
     restaurantManagementSystem.restaurantMenu();
    } //...  - .- -...  .-.. .
    void sumTheTotalOfAllTheOrder(){
        System.out.println("Your Total Bill Is: ");
    }
    void wantToOrderAgain(){
        System.out.println("Do You Want To Order Anything Else?  (Y/N)");
        char userChoice;
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.next().charAt(0); //We are using single quotes Because in java Single Quotes are used for Characters And Double Quotes Are USed for Strings
        if (userChoice == 'Y'){
            restaurantMenu();
        } else if (userChoice == 'N') {
            System.out.println("Thanks For Visiting Us");
        }
        else {
            System.out.println("Invalid Input");
        }

    }
    void pizzaFlavours(){
        System.out.println("1.Bonfire Pizza ");
        System.out.println("2.Kebabish Pizza ");
        System.out.println("3.MalaiBoti Pizza ");
        System.out.println("4.Chicken Tikka Pizza ");
        System.out.println("5.Nawabi Pizza");
        System.out.println("6.Crown Crust Pizza ");
        System.out.println("7.Chicken Special Cheese Pizza ");
        Scanner scanner = new Scanner(System.in);
        int enterSrNo = scanner.nextInt();
        if (enterSrNo == 1){
            System.out.println("Your Order is: " + "\n" + "Bonfire Pizza" + "\n" + "Price:$122.00");
        } else if (enterSrNo == 2){
            System.out.println("Your Order is: " + "\n" + "Kebabish Pizza" + "\n" + "Price:$124.00");
        } else if (enterSrNo == 3){
            System.out.println("Your Order is: " + "\n" + "MalaiBoti Pizza" + "\n" + "Price:$129.00");
        } else if (enterSrNo == 4){
            System.out.println("Your Order is: " + "\n" + "Chicken Tikka Pizza" + "\n" + "Price:$132.00");
        } else if (enterSrNo == 5){
            System.out.println("Your Order is: " + "\n" + "Nawabi Pizza" + "\n" + "Price:$142.00");
        } else if (enterSrNo == 6){
            System.out.println("Your Order is: " + "\n" + "Crown Crust Pizza" + "\n" + "Price:$222.00");
        } else if  (enterSrNo == 7){
            System.out.println("Your Order is: " + "\n" + "Chicken Special Cheese Pizza" + "\n" + "Price:$129.00");
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
    void burgerFlavours(){
        System.out.println("1.Zinger Burger");
        System.out.println("2.Patty Burger");
        System.out.println("3.Grilled Burger");
        System.out.println("4.Beef Burger");
        System.out.println("5.Double Patty Burger");
        System.out.println("6.Classic Burger");
        System.out.println("7.Cheese Burger");
        Scanner scanner = new Scanner(System.in);
        int enterSrNo = scanner.nextInt();
        if (enterSrNo == 1){
            System.out.println("Your Order is: " + "\n" + "Zinger Burger" + "\n" + "Price:$52.00");
        } else if (enterSrNo == 2){
            System.out.println("Your Order is: " + "\n" + "Patty Burger" + "\n" + "Price:$84.00");
        } else if (enterSrNo == 3){
            System.out.println("Your Order is: " + "\n" + "Grilled Burger" + "\n" + "Price:$69.00");
        } else if (enterSrNo == 4){
            System.out.println("Your Order is: " + "\n" + "Beef Burger" + "\n" + "Price:$42.00");
        } else if (enterSrNo == 5){
            System.out.println("Your Order is: " + "\n" + "Double Patty Burger" + "\n" + "Price:$42.00");
        } else if (enterSrNo == 6){
            System.out.println("Your Order is: " + "\n" + "Classic Burger" + "\n" + "Price:$82.00");
        } else if  (enterSrNo == 7){
            System.out.println("Your Order is: " + "\n" + "Cheese Burger" + "\n" + "Price:$129.00");
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
    void sandwiches(){
        System.out.println("1.Egg Sandwich");
        System.out.println("2.SeaFood Sandwich");
        System.out.println("3.Roast Beef Sandwich");
        System.out.println("4.Grilled Cheese Sandwich");
        System.out.println("5.Nutella Sandwich");
        System.out.println("6.Grilled Chicken Sandwich");
        System.out.println("7.Ham Sandwich");
        Scanner scanner = new Scanner(System.in);
        int enterSrNo = scanner.nextInt();
        if (enterSrNo == 1){
            System.out.println("Your Order is: " + "\n" + "Egg Sandwich" + "\n" + "Price:$22.00");
        } else if (enterSrNo == 2){
            System.out.println("Your Order is: " + "\n" + "SeaFood Sandwich" + "\n" + "Price:$24.00");
        } else if (enterSrNo == 3){
            System.out.println("Your Order is: " + "\n" + "Roast Beef Sandwich" + "\n" + "Price:$29.00");
        } else if (enterSrNo == 4){
            System.out.println("Your Order is: " + "\n" + "Grilled Cheese Sandwich" + "\n" + "Price:$32.00");
        } else if (enterSrNo == 5){
            System.out.println("Your Order is: " + "\n" + "Nutella Sandwich" + "\n" + "Price:$42.00");
        } else if (enterSrNo == 6){
            System.out.println("Your Order is: " + "\n" + "Grilled Chicken Sandwich" + "\n" + "Price:$122.00");
        } else if  (enterSrNo == 7){
            System.out.println("Your Order is: " + "\n" + "Ham Sandwich" + "\n" + "Price:$29.00");
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
    void coldDrinks(){
        System.out.println("1.Coca-Cola");
        System.out.println("2.Sprite");
        System.out.println("3.Fanta");
        System.out.println("4.Pepsi");
        System.out.println("5.Sting");
        System.out.println("6.MountainDew");
        System.out.println("7.Big Apple");
        Scanner scanner = new Scanner(System.in);
        int enterSrNo = scanner.nextInt();
        if (enterSrNo == 1){
            System.out.println("Your Order is: " + "\n" + "Coca-Cola" + "\n" + "Price:$22.00");
        } else if (enterSrNo == 2){
            System.out.println("Your Order is: " + "\n" + "Sprite" + "\n" + "Price:$24.00");
        } else if (enterSrNo == 3){
            System.out.println("Your Order is: " + "\n" + "Fanta" + "\n" + "Price:$19.00");
        } else if (enterSrNo == 4){
            System.out.println("Your Order is: " + "\n" + "Pepsi" + "\n" + "Price:$12.00");
        } else if (enterSrNo == 5){
            System.out.println("Your Order is: " + "\n" + "Sting" + "\n" + "Price:$12.00");
        } else if (enterSrNo == 6){
            System.out.println("Your Order is: " + "\n" + "MountainDew" + "\n" + "Price:$22.00");
        } else if  (enterSrNo == 7){
            System.out.println("Your Order is: " + "\n" + "Big Apple" + "\n" + "Price:$19.00");
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
    void desserts(){
        System.out.println("1.Gulab Jaman");
        System.out.println("2.Kheer");
        System.out.println("3.Kunafa");
        System.out.println("4.Paistrees");
        System.out.println("Ice-Cream");

        Scanner scanner = new Scanner(System.in);
        int enterSrNo = scanner.nextInt();
        if (enterSrNo == 1){
            System.out.println("Your Order is: " + "\n" + "Gulab Jaman" + "\n" + "Price:$10.00");
        } else if (enterSrNo == 2){
            System.out.println("Your Order is: " + "\n" + "Kheer" + "\n" + "Price:$12.00");
        } else if (enterSrNo == 3){
            System.out.println("Your Order is: " + "\n" + "Kunafa" + "\n" + "Price:$29.00");
        } else if (enterSrNo == 4){
            System.out.println("Your Order is: " + "\n" + "Paistrees" + "\n" + "Price:$32.00");
        } else if (enterSrNo == 5){
            System.out.println("Your Order is: " + "\n" + "Ice-Cream" + "\n" + "Price:$12.00");
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
    void restaurantMenu() {
        System.out.println("Enter your Choices: ");
        System.out.println("1.Pizza's");
        System.out.println("2.Burgers");
        System.out.println("3.Sandwiches");
        System.out.println("4.ColdDrinks");
        System.out.println("5.Desserts");
        Scanner scanner = new Scanner(System.in);
        int enterSerialNumber = scanner.nextInt();
        if (enterSerialNumber == 1) {
            pizzaFlavours();
        } else if (enterSerialNumber == 2) {
            burgerFlavours();
        } else if (enterSerialNumber == 3) {
            sandwiches();
        } else if (enterSerialNumber == 4) {
            coldDrinks();
        } else if (enterSerialNumber == 5) {
            desserts();
        }
        wantToOrderAgain();
    }
}
