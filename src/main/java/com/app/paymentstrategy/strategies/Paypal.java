package com.app.paymentstrategy.strategies;

import com.app.paymentstrategy.PaymentStrategy;
import com.app.paymentstrategy.StrategyName;

import org.springframework.stereotype.Component;

@Component
public class Paypal implements PaymentStrategy {

  @Override
  public void doPayment() {
    System.out.println("Paypal Payment");
    // implement paypal api here
  }

  @Override
  public StrategyName getStrategyName() {
    return StrategyName.PaypalStrategy;
  }
}