package com.kodilla.stream.forumuser;
import java.time.*;

public class ForumUser {
    private int id;
    private String userName;
    private char sex;
    private LocalDate date;
    private int numberPublicatePost;

    public ForumUser(int id, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberPublicatePost) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.date = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberPublicatePost = numberPublicatePost;
    }


    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumberPublicatePost() {
        return numberPublicatePost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                ", numberPublicatePost= " + numberPublicatePost +
                '}';
    }
}
