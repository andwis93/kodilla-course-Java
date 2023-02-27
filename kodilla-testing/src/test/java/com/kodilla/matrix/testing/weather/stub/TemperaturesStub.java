package com.kodilla.matrix.testing.weather.stub;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class TemperaturesStub implements Temperatures
{
    @Override
    public Map<String, Double> getTemperature()
    {
          Map<String,Double> stubResult = new HashMap<>();

        //dummy data
        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Krakow", 26.2);
        stubResult.put("Wroclaw", 24.8);
        stubResult.put("Warszawa", 25.2);
        stubResult.put("Gdansk", 26.1);

        return stubResult;
    }
}
