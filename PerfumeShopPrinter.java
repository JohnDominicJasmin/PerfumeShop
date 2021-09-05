 public class PerfumeShopPrinter{

public static void printMainMenu(){
  
System.out.println("\n\n");
System.out.println("|------------------------------------------------- 👋WELCOME -------------------------------------------------|");
System.out.println("|                                                                                                             |");
System.out.println("|  Proceed to:                                                                                                |");
System.out.println("|                                                                                                             |");
System.out.println("|\t\t👉 1. Elegant Perfume                                                                                 |");
System.out.println("|\t\t👉 2. Ordinary Perfume                                                                                |");
System.out.println("|\t\t👉 3. Exit                                                                                            |");
System.out.println("|                                                                                                             |");
System.out.print("|  Enter your choice:");

}


public static void printOrdinaryPerfumeShopPricesAndPromosMenu(){

System.out.println("\n|-------------------------------------------------------------------------------------------------------------|");
System.out.println("|                                              🏪Ordinary Perfume                                             |");
System.out.println("|                                                                                                             |");
System.out.println("|  Prices💵:                                                                                                  |");
System.out.println("|          ₱165.00 = per bottle                                                                               |");
System.out.println("|                                                                                                             |");
System.out.println("|   Promo💸:                                                                                                  |");
System.out.println("|          ₱150.00 = minimum of 5 bottles                                                                     |");
System.out.println("|          ₱125.00 = minimum of 10 bottles                                                                    |");
System.out.println("|      discount %5 = exceeds to 20 bottles                                                                    |");
System.out.println("|                                                                                                             |");
askNumberOfPerfume();

}


public static void printElegantPerfumeShopPricesAndPromosMenu(){

  System.out.println("\n|-------------------------------------------------------------------------------------------------------------|");
 System.out.println("|                                              🏪Elegant Perfume                                             |");
System.out.println("|                                                                                                             |");
System.out.println("|  Prices💵:                                                                                                  |");
System.out.println("|          ₱250.00 = per bottle                                                                                |");
System.out.println("|                                                                                                             |");
System.out.println("|   Promo💸:                                                                                                  |");
System.out.println("|          ₱185.00 = minimum of 5 bottles                                                                     |");
System.out.println("|          ₱170.00 = minimum of 10 bottles                                                                    |");
System.out.println("|      discount %5 = exceeds to 20 bottles                                                                    |");
System.out.println("|                                                                                                             |");
askNumberOfPerfume();

}

public static void askToContinue(){
    System.out.print("|\t👉 Would you like to use our System again? [Y/n]");
}
public static void printEnder(){
   System.out.print("|\t👉 K tnx bye!");
}
private static void askNumberOfPerfume(){
  System.out.print("|\t👉 Enter amount of perfume bottle:");
}
public static void printTotalPrice(double totalPrice){
  System.out.printf("Total cost is: ₱%.2f\n",totalPrice);
}

public static void askFee(){
  System.out.print("Enter fee amount:");
}

}