package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

import javax.sound.midi.Soundbank;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User jacek = new Millenials("Jacek Kloc");
        User jack = new YGeneration("Jack Clok");
        User jaack = new ZGeneration("Jaack Colk");

        //When
        String jacekShouldBe = jacek.publisher();
        System.out.println("Jacek should: " + jacekShouldBe);
        String jackShouldBe = jack.publisher();
        System.out.println("Jack should: " + jackShouldBe);
        String jaackShouldBe = jaack.publisher();
        System.out.println("Jaack Colk" + jaackShouldBe);

        //Then
        Assert.assertEquals("[Facebook] - activated", jacekShouldBe);
        Assert.assertEquals("[Twitter] - activated", jackShouldBe);
        Assert.assertEquals("[Snapchat] - activated", jaackShouldBe);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User jacek = new Millenials("Jacek Kloc");

        //When
        String jacekShouldBe = jacek.publisher();
        System.out.println("Jacek should: " + jacekShouldBe);
        jacek.sharePost(new SnapchatPublisher());
        jacekShouldBe = jacek.publisher();
        System.out.println("Jacek aktual profil is in" + jacekShouldBe);

        //Then
        Assert.assertEquals("[Snapchat] - activated",jacekShouldBe);

    }


}
