package com.UST.InterviewerForm.controller;

import com.UST.InterviewerForm.entity.InterviewEntity;
import com.UST.InterviewerForm.repository.InterviewRepo;
import com.UST.InterviewerForm.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/interview")
@Component

public class InterviewController {
    @Autowired
    private InterviewService services;
    private InterviewRepo repo;
    @PostMapping("/adddetail")
    public InterviewEntity adddetails(@RequestBody @Valid InterviewEntity interview){
        return services.createDetails(interview);

    }
    @PutMapping("/{id}")
    public InterviewEntity updateDetails(@PathVariable Long id, @RequestBody InterviewEntity interview) {
        return services.updateDetails(id, interview);
    }
    @GetMapping("/getdetails")
    public List<InterviewEntity> getAllInterviewer(){
        return services.getAllInterviewer();
    }
    @GetMapping("/getdetails/{id}")
    public Optional<InterviewEntity> getAllInterviewer(@PathVariable Long id){
        return services.getInterviewerById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteInterview(@PathVariable Long id) {
        services.deleteInterview(id);
    }

}

