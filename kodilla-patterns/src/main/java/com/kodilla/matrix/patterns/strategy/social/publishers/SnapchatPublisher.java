package com.kodilla.matrix.patterns.strategy.social.publishers;

public final class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Snapchat";
    }

}
