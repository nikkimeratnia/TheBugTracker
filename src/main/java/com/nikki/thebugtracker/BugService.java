package com.nikki.thebugtracker;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BugService {
    private final BugRepository bugRepository;
    public BugService(BugRepository bugRepository){
        this.bugRepository=bugRepository;
    }
    public void save(){
        List<String>bugs = new ArrayList<>();
    }
}
