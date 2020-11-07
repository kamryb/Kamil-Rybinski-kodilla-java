package com.kodilla.patterns.strategy.social;


import com.kodilla.patterns.strategy.Customer;

public class User {
    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public String publisher() {
        return socialPublisher.share();
    }

    public void sharePost(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

}
