package com.kodilla.stream.forumuser;


import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add(new ForumUser(1, "Kam", 'M', 2000, 1,
                3, 100));
        theForumUser.add(new ForumUser(2, "Dam", 'M', 2001, 6,
                4, 3));
        theForumUser.add(new ForumUser(3, "Kate", 'F', 2002, 2,
                4, 6));

        theForumUser.add(new ForumUser(4, "Edi", 'M', 1909, 12,
                4, 200));
        theForumUser.add(new ForumUser(5, "Jule", 'F', 2002, 2,
                4, 300));
    }
    public List<ForumUser> getList(){
        return new ArrayList<>(theForumUser);
    }

}
