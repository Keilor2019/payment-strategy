package com.app.paymentstrategy.strategies;
import com.app.paymentstrategy.PaymentStrategy;
import com.app.paymentstrategy.StrategyName;

import org.springframework.stereotype.Component;

@Component
public class CreditCard  implements PaymentStrategy{

  @Override
  public void doPayment() {
    System.out.println("CreditCard Payment");
      //implement algorithm A here 
  }
  
  @Override 
  public StrategyName getStrategyName() {
    return StrategyName.CreditCardStrategy;
  }
}