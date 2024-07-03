package com.alexandersaul.project.repositories;

import com.alexandersaul.project.models.FlashCard;
import org.springframework.data.repository.CrudRepository;

public interface FlashCardRepository extends CrudRepository<FlashCard,Long> {
}
