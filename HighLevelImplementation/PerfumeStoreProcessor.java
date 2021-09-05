package HighLevelImplementation;

import Abstractions.*;

public class PerfumeStoreProcessor {

  PerfumeStore perfumeStore;

  public PerfumeStoreProcessor(PerfumeStore perfumeStore) {
    this.perfumeStore = perfumeStore;
  }




  public void purchasePerfume() {
    perfumeStore.makePurchase();
  }

  public void printReceipt() {
    perfumeStore.printReceipt();

  }

  public void resetPrices() {
    perfumeStore.resetPrices();
  }

  public void setTotalFee(double fee) {
    perfumeStore.setTotalFee(fee);
  }

  public double getTotalPrice(){
   return perfumeStore.getTotalPrice();
  }
  public void payTotalPrice(){
    perfumeStore.payTotalPrice();
  }

}