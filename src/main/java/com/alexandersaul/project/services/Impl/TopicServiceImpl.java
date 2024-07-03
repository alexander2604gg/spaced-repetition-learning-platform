package com.alexandersaul.project.services.Impl;

import com.alexandersaul.project.models.Topic;
import com.alexandersaul.project.models.User;
import com.alexandersaul.project.repositories.TopicRepository;
import com.alexandersaul.project.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    TopicRepository topicRepository;

    @Override
    public List<Topic> getTopicsByUser(long user_id) {
        return topicRepository.findByUserId(user_id);
    }

    @Override
    public Topic save() {
        return null;
    }

    @Override
    public Topic update() {
        return null;
    }

    @Override
    public void delete() {

    }
}
