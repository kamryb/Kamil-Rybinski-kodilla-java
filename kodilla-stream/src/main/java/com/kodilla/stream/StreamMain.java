package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;



import java.util.Map;
import java.util.stream.Collectors;



public class StreamMain {
    public static void main(String[] args){
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUser = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
              .filter(forumUser ->  forumUser.getDate().getYear() < 2000)
                .filter(forumUser -> forumUser.getNumberPublicatePost()>0)
                .collect(Collectors.toMap(ForumUser::getId,forumUser -> forumUser));
        System.out.println("# elements: " + theResultMapOfForumUser.size());
      theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }


}


