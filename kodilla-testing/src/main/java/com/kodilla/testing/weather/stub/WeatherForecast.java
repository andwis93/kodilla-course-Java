package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures)
    {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast()
    {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperature().entrySet())
        {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature()
    {
        double averageTemperature = 0;
        for (Map.Entry<String, Double> singleTemperature : temperatures.getTemperature().entrySet())
        {
            averageTemperature = averageTemperature + singleTemperature.getValue();
        }

        return averageTemperature / temperatures.getTemperature().size();
    }

    public double medianTemperature()
    {
        List<Double> valueList = new ArrayList<>();

        for (Map.Entry<String, Double> singleTemperature : temperatures.getTemperature().entrySet())
        {
            valueList.add(singleTemperature.getValue());
        }

        return calculateTemperatureMedian(valueList);
    }

    public double calculateTemperatureMedian(List<Double> valueList)
    {
        int listMiddle;
        double unevenListMiddle;

        Collections.sort(valueList);
        if (valueList.size()> 0) {
            if (valueList.size() % 2 == 0) {
                listMiddle = valueList.size() / 2;
                return ((valueList.get(listMiddle - 1)) + (valueList.get(listMiddle))) / 2;
            } else {
                unevenListMiddle = valueList.size() / 2;
                listMiddle = (int) Math.round(unevenListMiddle);
                return valueList.get(listMiddle);
            }
        }else
        {
            return 0;
        }
    }
}

