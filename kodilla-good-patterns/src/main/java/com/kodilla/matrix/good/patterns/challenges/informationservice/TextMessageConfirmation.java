package com.kodilla.matrix.good.patterns.challenges.informationservice;

public class TextMessageConfirmation implements InformationService{
    @Override
    public void informBuyer(String confirmationTo) {

        System.out.println("Send confirmation to: " + confirmationTo);

    }
}
