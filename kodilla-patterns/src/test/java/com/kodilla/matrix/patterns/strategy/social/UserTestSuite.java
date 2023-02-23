package com.kodilla.matrix.patterns.strategy.social;

import com.kodilla.matrix.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    private static int counter = 1;

    @BeforeEach
    public void beforeEach() {
        System.out.println("\nTest#: " + counter);
        counter++;
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("");
    }

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User johnnyBravo = new Millenials("Johnny Bravo");
        User dexter = new ZGeneration("Dexter");
        User samuraiJack = new YGeneration("Samurai Jack");

        //When
        String johnnyBravoFavoriteSocialMedia = johnnyBravo.sharePost();
        System.out.println(johnnyBravo.getUserName() + "'s favorite social media is: " + johnnyBravoFavoriteSocialMedia);
        String dexterFavoriteSocialMedia = dexter.sharePost();
        System.out.println(dexter.getUserName() + "'s favorite social media is: " + dexterFavoriteSocialMedia);
        String samuraiJackFavoriteSocialMedia = samuraiJack.sharePost();
        System.out.println(samuraiJack.getUserName() + "'s favorite social media is: " + samuraiJackFavoriteSocialMedia);

        //Then
        assertEquals("Facebook", johnnyBravoFavoriteSocialMedia);
        assertEquals("Twitter", dexterFavoriteSocialMedia);
        assertEquals("Snapchat", samuraiJackFavoriteSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User johnnyBravo = new Millenials("Johnny Bravo");

        //When
        String johnnyBravoFavoriteSocialMedia = johnnyBravo.sharePost();
        System.out.println(johnnyBravo.getUserName() + "'s favorite social media is: " + johnnyBravoFavoriteSocialMedia);
        johnnyBravo.setFavoriteSocialMedia(new SnapchatPublisher());
        johnnyBravoFavoriteSocialMedia = johnnyBravo.sharePost();
        System.out.println(johnnyBravo.getUserName() + "'s favorite social media is: " + johnnyBravoFavoriteSocialMedia);

        //Then
        assertEquals("Snapchat", johnnyBravoFavoriteSocialMedia);
    }

}
