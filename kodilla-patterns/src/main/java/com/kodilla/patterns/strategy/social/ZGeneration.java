package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;

public final class ZGeneration extends User {

    public ZGeneration(String userName) {
        super(userName);
        this.favoriteSocialMedia = new TwitterPublisher();
    }

}
