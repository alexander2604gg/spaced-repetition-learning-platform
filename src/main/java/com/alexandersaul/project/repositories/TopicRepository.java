package com.alexandersaul.project.repositories;

import com.alexandersaul.project.models.Topic;
import com.alexandersaul.project.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends CrudRepository<Topic,Long> {

    List<Topic> findByUserId (long user_id);

}
