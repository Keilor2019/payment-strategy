package com.app.paymentstrategy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StrategyFactory {

  private Map<StrategyName, PaymentStrategy> strategies;
  
  @Autowired
  public StrategyFactory(Set<PaymentStrategy> strategySet) {
     createStrategy(strategySet);
  }
  
  public PaymentStrategy findStrategy(StrategyName strategyName) {
     return strategies.get(strategyName);
  }
  private void createStrategy(Set<PaymentStrategy> strategySet) {
      strategies = new HashMap<StrategyName, PaymentStrategy>();
      strategySet.forEach( 
   strategy ->strategies.put(strategy.getStrategyName(), strategy));
  }
}