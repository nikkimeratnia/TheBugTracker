package com.nikki.thebugtracker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BugRepository extends JpaRepository<Bug,Long> {

}
