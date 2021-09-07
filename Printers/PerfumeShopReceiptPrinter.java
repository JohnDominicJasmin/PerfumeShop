package Printers;

public class PerfumeShopReceiptPrinter {


  public static void printShopName(String shopName) {
    if(shopName == null){
      throw new RuntimeException("Your Shop name cannot be null!");
    }
 
    System.out.printf(
        "\n\n                ** 👋WELCOME TO ELEGANT PERFUME SHOP **                   \n\n\n",
        shopName);
  }

  public static void printTotalItems(int numberOfTotalItems) {
   System.out.printf(
            "|           Number of Items bought : %d                                   |\n", numberOfTotalItems);
  }

  public static void printOriginalPrice(double originalUnitPrice) {
       System.out.printf(
            "|     Original price of an Item is : ₱%.2f each                           |\n", originalUnitPrice);
  }

  public static void printPromo(double promoPrice) {
    
    System.out.printf(
        "|           Total price with promo : ₱%.2f                                    |\n", promoPrice);

  }

  public static void printOverallTotal(double totalPrice) {
     System.out.printf(
        "|        Total price without promo : ₱%.2f                                    |\n",totalPrice);
  }

  public static void printDiscounts(double discountPrice) {
   
    System.out.printf(
        "|                   Discount price : ₱%.2f                                    |\n",discountPrice);
  }

  public static void printReceiptFooter(){
        System.out.println(
        "|-----------------------------------------------------------------------------|\n");
     
  }







}