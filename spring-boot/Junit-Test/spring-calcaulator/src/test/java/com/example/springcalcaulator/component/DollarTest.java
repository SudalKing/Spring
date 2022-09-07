package com.example.springcalcaulator.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class DollarTest {

    @MockBean // Spring에서는 bean으로 관리되기 때문에 java와는 다르게 @Mock이 아닌 @MockBean을 붙임
    private MarketApi marketApi;

    @Autowired
    private Calculator calculator;
    // final을 안붙이면 인식이 안되어 null예외를 던짐

    @Test
    public void dollarCalculatorTest(){
        Mockito.when(marketApi.connect()).thenReturn(3000);

        int sum = calculator.sum(10, 10);
        int minus = calculator.minus(10, 10);

        Assertions.assertEquals(60000, sum);
        Assertions.assertEquals(0, minus);


    }

}
