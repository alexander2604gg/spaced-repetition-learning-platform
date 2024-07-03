package com.alexandersaul.project.repositories;

import com.alexandersaul.project.models.SubTopic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubTopicRepository extends CrudRepository<SubTopic,Long> {

    @Query(value = "SELECT * FROM sub_topic WHERE topic_id_topic = :topicId", nativeQuery = true)
    List<SubTopic> findByTopicId(long topicId);
}
