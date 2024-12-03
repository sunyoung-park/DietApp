package com.study.dev.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>  {
	Question findBySubject(String subject);
	Question findbySubjectAndContent(String subject, String content);
	List<Question> findBySubjectLike(String subject);
	

}
