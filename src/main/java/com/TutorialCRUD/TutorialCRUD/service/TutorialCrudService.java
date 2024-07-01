package com.TutorialCRUD.TutorialCRUD.service;

import com.TutorialCRUD.TutorialCRUD.repository.ITutorialCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TutorialCrudService {
    @Autowired
    ITutorialCrudRepository iTutorialCrudRepository;


}
