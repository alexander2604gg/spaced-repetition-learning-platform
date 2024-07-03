package com.alexandersaul.project.Controller;


import com.alexandersaul.project.models.Topic;
import com.alexandersaul.project.models.User;
import com.alexandersaul.project.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;


    @GetMapping("{id_user}/listTopics")
    public String topics (@PathVariable long id_user , Model model) {
        List<Topic> topics = topicService.getTopicsByUser(id_user);
        model.addAttribute("topics" , topics);
        return "views/topics";
    }




}
