package com.kodilla.matrix.patterns.strategy.social.publishers;

public final class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Twitter";
    }

}
