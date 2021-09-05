import HighLevelImplementation.PerfumeStoreProcessor;
import Wrappers.ElegantPerfumeStoreWrapper;
import Wrappers.OrdinaryPerfumeStoreWrapper;
import java.util.*;

class Main {

  private static int perfumeShopChoice;
  private static String wishToContinue;


  public static void main(String[] args) {

    Scanner getInput = new Scanner(System.in);

    PerfumeShopPrinter.printMainMenu();

    try {
      perfumeShopChoice = getInput.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Input invalid");
    }

  do{
    switch (perfumeShopChoice) {
      case 1:
      
      try{
        PerfumeShopPrinter.printOrdinaryPerfumeShopPricesAndPromosMenu();
        var perfumeStore = new PerfumeStoreProcessor(new ElegantPerfumeStoreWrapper(getInput.nextInt()));
        perfumeStore.purchasePerfume();
        PerfumeShopPrinter.printTotalPrice(perfumeStore.getTotalPrice());
        PerfumeShopPrinter.askFee();
        perfumeStore.setTotalFee(getInput.nextDouble());
        perfumeStore.payTotalPrice();
        perfumeStore.printReceipt();
      }catch(RuntimeException e){
        System.out.println(e.getMessage());
      }
   
        break;

      case 2:

       try{
        PerfumeShopPrinter.printElegantPerfumeShopPricesAndPromosMenu();
        var perfumeStore = new PerfumeStoreProcessor(new OrdinaryPerfumeStoreWrapper(getInput.nextInt()));
        perfumeStore.purchasePerfume();
        PerfumeShopPrinter.printTotalPrice(perfumeStore.getTotalPrice());
        PerfumeShopPrinter.askFee();
        perfumeStore.setTotalFee(getInput.nextDouble());
        perfumeStore.payTotalPrice();
        perfumeStore.printReceipt();
      }catch(RuntimeException e){
        System.out.println(e.getMessage());
      }
   
        break;

      
      default:
       System.out.println("Choice doesn't exist!");
    }
    PerfumeShopPrinter.askToContinue();
    wishToContinue = getInput.nextLine();
  }while(wishToContinue == Yes());

  

  }





  public static String Yes(){
    String[] arr = {"Y","y","Yes","yes"};
    for(String answer:arr){
      return answer;
    }
return "";
  }

  // catch error if pay is insufficient
  // handle error if double,long,int
  // print success
  // print thank you for using our system
  //close scanner
  //reset prices
  //catch if no amount of bottles bought
  //catch for insuffient funds
}