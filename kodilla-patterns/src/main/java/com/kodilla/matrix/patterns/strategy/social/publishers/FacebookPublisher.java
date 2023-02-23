package com.kodilla.matrix.patterns.strategy.social.publishers;

public final class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Facebook";
    }

}
