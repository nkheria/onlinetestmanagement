package com.cg.onlinetestms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinetestms.entities.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
