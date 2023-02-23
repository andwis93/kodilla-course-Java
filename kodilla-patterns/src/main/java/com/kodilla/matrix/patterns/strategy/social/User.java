package com.kodilla.matrix.patterns.strategy.social;

import com.kodilla.matrix.patterns.strategy.social.publishers.SocialPublisher;

public sealed class User
        permits Millenials, YGeneration, ZGeneration {
    private final String userName;
    protected SocialPublisher favoriteSocialMedia;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return this.favoriteSocialMedia.share();
    }

    public void setFavoriteSocialMedia (SocialPublisher favoriteSocialMedia) {
        this.favoriteSocialMedia = favoriteSocialMedia;
    }

}
