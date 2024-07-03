package com.alexandersaul.project.services;

import com.alexandersaul.project.models.SubTopic;

import java.util.List;

public interface SubTopicService {

    List<SubTopic> getByTopicId(long id_topic);

}
