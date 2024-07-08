package com.TutorialCRUD.TutorialCRUD.service;

import com.TutorialCRUD.TutorialCRUD.repository.ITutorialCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TutorialCrudService {

    @Autowired
    ITutorialCrudRepository iTutorialCrudRepository;

    public boolean deleteTask(int id) {
        try {
            iTutorialCrudRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
