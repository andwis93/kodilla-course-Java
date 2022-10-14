package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;

public final class YGeneration extends User {

    public YGeneration(String userName) {
        super(userName);
        this.favoriteSocialMedia = new SnapchatPublisher();
    }

}
