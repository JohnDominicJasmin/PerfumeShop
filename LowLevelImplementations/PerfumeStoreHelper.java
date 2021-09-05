package LowLevelImplementations;

 public class PerfumeStoreHelper {

 
  private int numberOfPurchaseItems;

  public PerfumeStoreHelper(int numberOfPurchaseItems) {
    this.numberOfPurchaseItems = numberOfPurchaseItems;
  }


  public boolean purchasedBottleExceedsTen() {
    return numberOfPurchaseItems >= 10;
  }

  public boolean purchasedBottleExceedsFive() {
    return numberOfPurchaseItems >= 5;
  }

  public boolean purchaseBottleExceedsTwenty() {
    return numberOfPurchaseItems >= 20;
  }

  public boolean customerBuysNothing() {
    return numberOfPurchaseItems == 0;
  }


}