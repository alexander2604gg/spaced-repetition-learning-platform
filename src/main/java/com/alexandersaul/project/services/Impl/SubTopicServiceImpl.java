package com.alexandersaul.project.services.Impl;

import com.alexandersaul.project.models.SubTopic;
import com.alexandersaul.project.repositories.SubTopicRepository;
import com.alexandersaul.project.services.SubTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SubTopicServiceImpl implements SubTopicService {

    @Autowired
    SubTopicRepository subTopicRepository;

    @Override
    public List<SubTopic> getByTopicId(long id_topic) {
        return subTopicRepository.findByTopicId(id_topic);
    }

}
