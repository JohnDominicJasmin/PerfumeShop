class PerfumeShopReceiptPrinter{
  private String shopName;
  private int numberOfTotalItems;
  private double originalUnitPrice;
  private double promoPrice;
  private double totalPrice;
  private double discountPrice;



  public PerfumeShopReceiptPrinter(String shopName){
    this.shopName = shopName;
  }

  public  void setTotalItems(int numberOfTotalItems){
      this.numberOfTotalItems = numberOfTotalItems;
  }
  public  void setOriginalPrice(double originalUnitPrice){
      this.originalUnitPrice = originalUnitPrice;
  }
  public  void setPromo(double promoPrice){
      this.promoPrice = promoPrice;
  }
  public  void setOverallTotal(double totalPrice){
      this.totalPrice = totalPrice;
  }
  public  void setDiscounts(double discountPrice){
      this.discountPrice = discountPrice;
  }




  public void printReceipt(){

  }



}