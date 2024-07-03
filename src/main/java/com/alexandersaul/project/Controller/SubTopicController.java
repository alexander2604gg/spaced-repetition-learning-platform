package com.alexandersaul.project.Controller;

import com.alexandersaul.project.models.SubTopic;
import com.alexandersaul.project.services.SubTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SubTopicController {

    @Autowired
    private SubTopicService subTopicService;

    @GetMapping("{id_topic}/listSubTopics")
    public String subTopics (@PathVariable long id_topic , Model model){
        List<SubTopic> subTopicList = subTopicService.getByTopicId(id_topic);
        model.addAttribute("subTopicList" , subTopicList);
        return "views/subTopics";
    }

}
