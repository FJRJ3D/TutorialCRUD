package com.TutorialCRUD.TutorialCRUD.controller;


import com.TutorialCRUD.TutorialCRUD.model.Tutorial;
import com.TutorialCRUD.TutorialCRUD.service.TutorialCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")

    public class TutorialCrudController {
    @Autowired
    TutorialCrudService tutorialCrudService;

    @PostMapping (path = "/tutorials")
    public Tutorial createTutorial(@RequestBody Tutorial newTutorial){
        return tutorialCrudService.createTutorial(newTutorial);
    }

}
