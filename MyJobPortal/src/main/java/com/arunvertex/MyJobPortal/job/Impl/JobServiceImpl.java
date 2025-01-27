package com.arunvertex.MyJobPortal.job.Impl;

import com.arunvertex.MyJobPortal.job.Job;
import com.arunvertex.MyJobPortal.job.JobService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Override
    public List<Job> getAllJob() {
        return List.of();
    }

    @Override
    public void createJob(Job job) {

    }

    @Override
    public Job getJobById(Long id) {
        return null;
    }

    @Override
    public boolean deleteJobById(Long id) {
        return false;
    }

    @Override
    public boolean updateJobById(Long id, Job updatedJob) {
        return false;
    }
}
