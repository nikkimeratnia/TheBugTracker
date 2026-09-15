package com.nikki.thebugtracker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugService {
    private final BugRepository bugRepository;
    public BugService(BugRepository bugRepository){
        this.bugRepository=bugRepository;
    }
    public Bug saveBug(Bug inputBug){
        return bugRepository.save(inputBug);
    }
    public List<Bug> getAllBugs(){
        return bugRepository.findAll();

    }
}
