package com.kodilla.matrix.patterns.strategy.social.publishers;

public sealed interface SocialPublisher
        permits FacebookPublisher, SnapchatPublisher, TwitterPublisher {

    String share();

}
