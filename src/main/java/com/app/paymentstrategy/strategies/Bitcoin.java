package com.app.paymentstrategy.strategies;
import com.app.paymentstrategy.PaymentStrategy;
import com.app.paymentstrategy.StrategyName;

import org.springframework.stereotype.Component;

@Component
public class Bitcoin  implements PaymentStrategy{

  @Override
  public void doPayment() {
    System.out.println("Bitcoint Payment");
      //implement bitcoin api here 
  }
  @Override 
  public StrategyName getStrategyName() {
    return StrategyName.BitcoinStrategy;
  }
}