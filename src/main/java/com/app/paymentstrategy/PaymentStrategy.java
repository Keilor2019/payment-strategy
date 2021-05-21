package com.app.paymentstrategy;



public interface PaymentStrategy {
    void doPayment();
    StrategyName getStrategyName();
}