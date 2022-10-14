package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;

public final class Millenials extends User {

    public Millenials(String userName) {
        super(userName);
        this.favoriteSocialMedia = new FacebookPublisher();
    }

}
