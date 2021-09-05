import HighLevelImplementation.PerfumeStoreProcessor;
import Wrappers.ElegantPerfumeStoreWrapper;
import Wrappers.OrdinaryPerfumeStoreWrapper;
import java.util.*;

class Main {

  private static int userChoice;



  public static void main(String[] args) {

    Scanner getInput = new Scanner(System.in);

    PerfumeShopPrinter.printMainMenu();

    try {
      userChoice = getInput.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Input invalid");
    }

    switch (userChoice) {
      case 1:
      
      try{
        PerfumeShopPrinter.printOrdinaryPerfumeShopPricesAndPromosMenu();
        var perfumeStore = new PerfumeStoreProcessor(new ElegantPerfumeStoreWrapper(getInput.nextInt()));
        perfumeStore.purchasePerfume();
        PerfumeShopPrinter.printTotalPrice(perfumeStore.getTotalPrice());
        PerfumeShopPrinter.printFeeMessage();
        perfumeStore.setTotalFee(getInput.nextDouble());
        perfumeStore.payTotalPrice();
        perfumeStore.printReceipt();
      }catch(RuntimeException e){
        System.out.println(e.getMessage());
      }
    //catch for insuffient funds
        break;

      case 2:

        break;
      default:
    }

  }
  // catch error if pay is insufficient
  // handle error if double,long,int
  // print success
  // print thank you for using our system
  //close scanner
  //reset prices
  //catch if no amount of bottles bought
}