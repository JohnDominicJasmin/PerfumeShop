package LowLevelImplementations;

 public class PerfumeStoreHelper {
  
  private final int TEN_ITEMS_OF_PERFUME = 10;
  private final int FIVE_ITEMS_OF_PERFUME = 5;
  private final int TWENTY_ITEMS_OF_PERFUME = 20;
 
  private int numberOfPurchaseItems;

  public PerfumeStoreHelper(int numberOfPurchaseItems) {
    this.numberOfPurchaseItems = numberOfPurchaseItems;
  }


  public boolean purchasedBottleExceedsTen() {
    return numberOfPurchaseItems >= TEN_ITEMS_OF_PERFUME;
  }

  public boolean purchasedBottleExceedsFive() {
    return numberOfPurchaseItems >= FIVE_ITEMS_OF_PERFUME;
  }

  public boolean purchaseBottleExceedsTwenty() {
    return numberOfPurchaseItems >= TWENTY_ITEMS_OF_PERFUME;
  }

  public boolean customerBuysNothing() {
    return numberOfPurchaseItems == 0;
  }


}