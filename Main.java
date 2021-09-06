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
      PerfumeShopPrinter.printMainMenu();

      try {
        perfumeShopChoice = getInput.nextInt();
      } catch (InputMismatchException e) {
        PerfumeShopPrinter.printInvalidInput();
        break;
      }

      switch (perfumeShopChoice) {

        case 1:
          PerfumeShopPrinter.printElegantPerfumeShopPricesAndPromosMenu();
          PerfumeShopPrinter.askNumberOfPerfume();
          try {

            int numberOfPerfume = getInput.nextInt();
            initializePerfumeStore(new ElegantPerfumeStoreWrapper(numberOfPerfume), getInput);

          } catch (InputMismatchException e) {
            PerfumeShopPrinter.printInvalidInput();
            System.exit(0);
          } catch (RuntimeException e) {
            PerfumeShopPrinter.printRunTimeExceptionError(e.getMessage());
            System.exit(0);
          
          }

          break;

        case 2:
          PerfumeShopPrinter.printOrdinaryPerfumeShopPricesAndPromosMenu();
          PerfumeShopPrinter.askNumberOfPerfume();
          try {

            int numberOfPerfume = getInput.nextInt();
            initializePerfumeStore(new OrdinaryPerfumeStoreWrapper(numberOfPerfume), getInput);

          } catch (InputMismatchException e) {
            PerfumeShopPrinter.printInvalidInput();
            System.exit(0);
            break;
          } catch (RuntimeException e) {
            PerfumeShopPrinter.printRunTimeExceptionError(e.getMessage());
            System.exit(0);
            break;
          }

          break;

        case 3:

          PerfumeShopPrinter.printEnder();
          getInput.close();
          System.exit(0);
          break;

        default:
          System.out.println("Choice doesn't exist!");

      }

      PerfumeShopPrinter.askToContinue();
      wishToContinue = getInput.next();

    } while (wishToContinue.equals("Y") || wishToContinue.equals("y"));

    PerfumeShopPrinter.printEnder();
    getInput.close();

  }


  private static void runPerfumeStore()

  private static void initializePerfumeStore(PerfumeStore store, Scanner getInput) {

    var perfumeStore = new PerfumeStoreProcessor(store);
    perfumeStore.purchasePerfume();
    PerfumeShopPrinter.printTotalPrice(perfumeStore.getTotalPrice());
    PerfumeShopPrinter.askFee();
    perfumeStore.setTotalFee(getInput.nextDouble());
    perfumeStore.payTotalPrice();
    perfumeStore.printReceipt();
    perfumeStore.resetPrices();
  }

}