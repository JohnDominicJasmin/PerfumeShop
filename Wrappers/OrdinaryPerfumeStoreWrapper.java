package Wrappers;
import LowLevelImplementations.*;
import Abstractions.PerfumeStore;
public class OrdinaryPerfumeStoreWrapper extends PerfumeStore{

private OrdinaryPerfumeStore ordinaryPerfume;

public OrdinaryPerfumeStoreWrapper(int numberOfPurchaseItems){

  ordinaryPerfume = new OrdinaryPerfumeStore(numberOfPurchaseItems);

}


@Override public void makePurchase(){
ordinaryPerfume.makePurchase();
}

@Override public void printReceipt(){
ordinaryPerfume.printReceipt();
}

@Override public void resetPrices(){
  ordinaryPerfume.resetPrices();
}

@Override public void setTotalFee(double fee){
  ordinaryPerfume.setTotalFee(fee);
}
@Override public double getTotalPrice(){
  return ordinaryPerfume.getTotalPrice();
}
@Override public void payTotalPrice(){
  ordinaryPerfume.payTotalPrice();
}
}
