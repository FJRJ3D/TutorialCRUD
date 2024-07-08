package com.TutorialCRUD.TutorialCRUD.repository;

import com.TutorialCRUD.TutorialCRUD.model.Tutorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITutorialCrudRepository extends CrudRepository<Tutorial, Integer> {
}
