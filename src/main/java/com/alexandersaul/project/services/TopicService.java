package com.alexandersaul.project.services;

import com.alexandersaul.project.models.Topic;
import com.alexandersaul.project.models.User;

import java.util.List;

public interface TopicService {

    List<Topic> getTopicsByUser(long user_id);
    Topic save ();
    Topic update ();
    void delete ();

}
