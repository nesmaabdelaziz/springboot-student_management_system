package com.studentmanagementsystem.springboot.app.service;

import com.studentmanagementsystem.springboot.app.dao.AssignmentSubmissionDAO;
import com.studentmanagementsystem.springboot.app.entity.AssignmentSubmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentSubmissionServiceImp implements AssignmentSubmissionService{
    private AssignmentSubmissionDAO assignmentSubmissionDAO;

    @Autowired
    public AssignmentSubmissionServiceImp(AssignmentSubmissionDAO assignmentSubmissionDAO) {
        this.assignmentSubmissionDAO = assignmentSubmissionDAO;
    }

    @Override
    public void save(AssignmentSubmission assignmentSubmission) {
        assignmentSubmissionDAO.save(assignmentSubmission);
    }

    @Override
    public void deleteById(int id) {
        assignmentSubmissionDAO.deleteById(id);
    }

    @Override
    public List<AssignmentSubmission> findAll() {
        return assignmentSubmissionDAO.findAll();
    }

    @Override
    public AssignmentSubmission findById(int id) {
        Optional<AssignmentSubmission> result = assignmentSubmissionDAO.findById(id);
        return result.orElse(null);
    }

}
