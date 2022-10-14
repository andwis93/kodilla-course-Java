package com.kodilla.patterns.strategy.social.publishers;

public sealed interface SocialPublisher
        permits FacebookPublisher, SnapchatPublisher, TwitterPublisher {

    String share();

}
