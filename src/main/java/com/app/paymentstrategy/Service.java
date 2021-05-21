package com.app.paymentstrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

  @Autowired
  private StrategyFactory strategyFactory;

  @RequestMapping("/{name}")
  public void findTheStrategy(@PathVariable String name){  
    StrategyName strategySelected=null; 
   switch (name) {
     case "btc":
       strategySelected = StrategyName.BitcoinStrategy;
       break;
       case "card":
       strategySelected = StrategyName.CreditCardStrategy;
       break;
       case "paypal":
       strategySelected = StrategyName.PaypalStrategy;
       break;
       default:
       strategySelected = null;
       break;
   }

  // Now get the strategy by passing the name 
  PaymentStrategy strategy =  strategyFactory.findStrategy(strategySelected);
   // you can now call the methods defined in strategy.
   strategy.doPayment();
  }
}