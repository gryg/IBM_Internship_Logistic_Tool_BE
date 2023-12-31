package com.ibm.internshipTool.services;


import com.ibm.internshipTool.models.Grade;
import com.ibm.internshipTool.repositories.GradeRepository;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;

    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }
    public List<Grade> getGradesByActivity(Long activityId) {
        return gradeRepository.getGradesByActivity(activityId);
    }
    // methods for CRUD operations or custom business logic
}