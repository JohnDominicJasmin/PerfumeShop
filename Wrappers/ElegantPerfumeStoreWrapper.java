package Wrappers;
import LowLevelImplementations.*;
import Abstractions.*;

public class ElegantPerfumeStoreWrapper extends PerfumeStore{
  private ElegantPerfumeStore elegantPerfumeStore;

public ElegantPerfumeStoreWrapper(int numberOfPurchaseItems){
  elegantPerfumeStore = new ElegantPerfumeStore(numberOfPurchaseItems);
}

@Override public void makePurchase(){
elegantPerfumeStore.makePurchase();
}

@Override public void printReceipt(){
elegantPerfumeStore.printReceipt();
}


@Override public void resetPrices(){
  elegantPerfumeStore.resetPrices();
}
@Override public void setTotalFee(double fee){
  elegantPerfumeStore.setTotalFee(fee);
}
@Override public double getTotalPrice(){
  return elegantPerfumeStore.getTotalPrice();
}
@Override public void payTotalPrice(){
  elegantPerfumeStore.payTotalPrice();
}

} 