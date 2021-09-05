import HighLevelImplementation.PerfumeStoreProcessor;
import Wrappers.ElegantPerfumeStoreWrapper;
import Wrappers.OrdinaryPerfumeStoreWrapper;
import java.util.*;

import Abstractions.PerfumeStore;

class Main {

  private static int perfumeShopChoice;
  private static String wishToContinue;


  public static void main(String[] args) {

    Scanner getInput = new Scanner(System.in);



do{
    PerfumeShopPrinter.printMainMenu();

    try {
      perfumeShopChoice = getInput.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Input invalid");
    }

    switch (perfumeShopChoice) {

      case 1:
        PerfumeShopPrinter.printElegantPerfumeShopPricesAndPromosMenu();
      try{
          runPerfumeStore(new ElegantPerfumeStoreWrapper(getInput.nextInt()), getInput);
      }catch(RuntimeException e){
        System.out.println(e.getMessage());
      }
   
      break;

      case 2:
       PerfumeShopPrinter.printOrdinaryPerfumeShopPricesAndPromosMenu();
       try{
        runPerfumeStore(new OrdinaryPerfumeStoreWrapper(getInput.nextInt()), getInput);
      }catch(RuntimeException e){
        System.out.println(e.getMessage());
      }

      break;
        
      case 3:
        
         System.exit(0);
         getInput.close();
      
      break;
      

      default:
       System.out.println("Choice doesn't exist!");
      
    }

    PerfumeShopPrinter.askToContinue();
    wishToContinue = getInput.next();

  }while(wishToContinue.equals("Y") || wishToContinue.equals("y"));

  PerfumeShopPrinter.printEnder();
  getInput.close();

  }









  private static void runPerfumeStore(PerfumeStore store,Scanner getInput){
  
        var perfumeStore = new PerfumeStoreProcessor(store);
        perfumeStore.purchasePerfume();
        PerfumeShopPrinter.printTotalPrice(perfumeStore.getTotalPrice());
        PerfumeShopPrinter.askFee();
        perfumeStore.setTotalFee(getInput.nextDouble());
        perfumeStore.payTotalPrice();
        perfumeStore.printReceipt();
        perfumeStore.resetPrices();
  }
  // catch error if pay is insufficient
  // handle error if double,long,int
  //catch if no amount of bottles bought
  //catch for insuffient funds
}