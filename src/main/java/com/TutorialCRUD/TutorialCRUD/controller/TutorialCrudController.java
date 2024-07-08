package com.TutorialCRUD.TutorialCRUD.controller;


import com.TutorialCRUD.TutorialCRUD.service.TutorialCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TutorialCrudController {
    @Autowired
    TutorialCrudService tutorialCrudService;

    @DeleteMapping(
            path = {"/tutorials/{id}"}
    )
    public String deleteTask(@PathVariable("id") int id) {
        boolean isRemoved = this.tutorialCrudService.deleteTask(id);
        return isRemoved ? "Task with id " + id + " was deleted successfully." : "Task with id " + id + " was not found.";
    }
}
