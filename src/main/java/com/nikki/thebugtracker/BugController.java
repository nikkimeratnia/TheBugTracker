package com.nikki.thebugtracker;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BugController {
    private final BugService bugService;
    public BugController(BugService bugService){
        this.bugService = bugService;
    }
    @GetMapping("/bug")
    public String getAllBugs(Model model){
        model.addAttribute("bugs",bugService.getAllBugs());
        return "bugs";
    }

}
