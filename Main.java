import Printers.PerfumeShopMenuPrinter;
import HighLevelImplementation.PerfumeStoreProcessor;
import Wrappers.ElegantPerfumeStoreWrapper;
import Wrappers.OrdinaryPerfumeStoreWrapper;
import java.util.*;

import Abstractions.PerfumeStore;

class Main {

  private static int perfumeShopChoice;
  private static String wishToContinue;
  private static Scanner getInput = new Scanner(System.in);

  public static void main(String[] args) {

    do {
      PerfumeShopMenuPrinter.printMainMenu();

      try {
        perfumeShopChoice = getInput.nextInt();
      } catch (InputMismatchException e) {
        PerfumeShopMenuPrinter.printInvalidInput();
        break;
      }

      switch (perfumeShopChoice) {

        case 1:
          PerfumeShopMenuPrinter.printElegantPerfumeShopPricesAndPromosMenu();
          PerfumeShopMenuPrinter.askNumberOfPerfume();
          runElegantPerfumeStore(getInput);
         
          break;

        case 2:
          PerfumeShopMenuPrinter.printOrdinaryPerfumeShopPricesAndPromosMenu();
          PerfumeShopMenuPrinter.askNumberOfPerfume();
          runOrdinaryPerfumeStore(getInput);

          break;

        case 3:

          PerfumeShopMenuPrinter.printEnder();
          getInput.close();
          System.exit(0);
          break;

        default:
          System.out.println("Choice doesn't exist!");

      }

      PerfumeShopMenuPrinter.askToContinue();
      wishToContinue = getInput.next();

    } while (wishToContinue.equals("Y") || wishToContinue.equals("y"));

    PerfumeShopMenuPrinter.printEnder();
    getInput.close();

  }





  private static void runOrdinaryPerfumeStore(Scanner getInput){
      try {

            int numberOfPerfume = getInput.nextInt();
            performOperation(new OrdinaryPerfumeStoreWrapper(numberOfPerfume), getInput);

          } catch (InputMismatchException e) {
            PerfumeShopMenuPrinter.printInvalidInput();
            System.exit(0);
          } catch (RuntimeException error) {
            System.out.printf("   👉 %s\n", error.getMessage());
            System.exit(0);
          
          }

  }



  private static void runElegantPerfumeStore(Scanner getInput){
      try {

            int numberOfPerfume = getInput.nextInt();
            performOperation(new ElegantPerfumeStoreWrapper(numberOfPerfume), getInput);

          } catch (InputMismatchException e) {
            PerfumeShopMenuPrinter.printInvalidInput();
            System.exit(0);
          } catch (RuntimeException e) {
            System.out.printf("   👉 %s\n", e.getMessage());
            System.exit(0);
          
          }

  }

  private static void performOperation(PerfumeStore store, Scanner getInput) {

    var perfumeStore = new PerfumeStoreProcessor(store);
    perfumeStore.purchasePerfume();
    PerfumeShopMenuPrinter.printTotalPrice(perfumeStore.getTotalPrice());
    PerfumeShopMenuPrinter.askFee();
    perfumeStore.setTotalFee(getInput.nextDouble());
    perfumeStore.payTotalPrice();
    perfumeStore.printReceipt();
    perfumeStore.resetPrices();
  }

}