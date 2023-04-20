package com.UST.InterviewerForm.repository;

import com.UST.InterviewerForm.entity.InterviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InterviewRepo  extends JpaRepository<InterviewEntity,Long> {


}
