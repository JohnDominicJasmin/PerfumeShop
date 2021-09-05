package Abstractions;

public abstract class PerfumeStore{

  public abstract void printReceipt();
  public abstract void makePurchase();
  public abstract void resetPrices();
  public abstract void setTotalFee(double fee);
  public abstract double getTotalPrice();
  public abstract void payTotalPrice();

}
