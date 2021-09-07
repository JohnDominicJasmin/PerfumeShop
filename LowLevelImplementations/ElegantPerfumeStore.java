package LowLevelImplementations;
import Printers.PerfumeShopReceiptPrinter;
public class ElegantPerfumeStore {
  private final double ORIGINAL_UNIT_PRICE = 250.00;
  private final double PROMO_PRICE_FOR_TEN_PERFUMES = 170.00;
  private final double PROMO_PRICE_FOR_FIVE_PERFUMES = 185.00;
  private final double DISCOUNT_PERCENTAGE = 5.00;

  private int numberOfPurchaseItems;
  private double totalPrice;
  private double totalPromoPrice;
  private double discountPrice;
  private PerfumeStoreHelper perfume;
  private double totalFee;

  public ElegantPerfumeStore(int numberOfPurchaseItems) {
    this.numberOfPurchaseItems = numberOfPurchaseItems;
    this.perfume = new PerfumeStoreHelper(numberOfPurchaseItems);
    resetPrices();
  }

  public void makePurchase() {
    if (perfume.customerBuysNothing()) {
      throw new RuntimeException("Amount of perfume bottles is invalid");
    }

    setTotalPrice();
    setPromo();
    setDiscount();
  }

  public void printReceipt() {
   
    PerfumeShopReceiptPrinter.printShopName("Elegant Perfume Shop");
    PerfumeShopReceiptPrinter.printOriginalPrice(ORIGINAL_UNIT_PRICE);
    PerfumeShopReceiptPrinter.printOverallTotal(totalPrice);

    
    if(promoApplied()){
      PerfumeShopReceiptPrinter.printPromo(totalPromoPrice);
    }
    if(discountApplied()){
      PerfumeShopReceiptPrinter.printDiscounts(discountPrice);
    }
  }

  public void resetPrices() {
    totalPrice = 0.00;
    totalPromoPrice = 0.00;
    discountPrice = 0.00;
  }

  public void setTotalFee(double fee) {
   
    
    this.totalFee = fee;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void payTotalPrice() {
    if (amountInsuffiencent()) {
      throw new RuntimeException("Insufficient funds!");
    }
  }


  private void setTotalPrice() {
    totalPrice = ORIGINAL_UNIT_PRICE * numberOfPurchaseItems;
  }

  private void setPromo() {

    if (perfume.purchasedBottleExceedsTen()) {
      totalPromoPrice = PROMO_PRICE_FOR_TEN_PERFUMES * numberOfPurchaseItems;
      return;
    }
    if (perfume.purchasedBottleExceedsFive()) {
      totalPromoPrice = PROMO_PRICE_FOR_FIVE_PERFUMES * numberOfPurchaseItems;
    }

  }

  private void setDiscount() {
    if (perfume.purchaseBottleExceedsTwenty()) {
      discountPrice = DISCOUNT_PERCENTAGE * totalPrice / 100;
    }
  }

  private boolean amountInsuffiencent() {
    return totalFee < totalPrice;
  }

  private boolean promoApplied() {
    return totalPromoPrice != 0.00;
  }

  private boolean discountApplied() {
    return discountPrice != 0.00;
  }
}