package com.arunvertex.MyJobPortal.job.Impl;

import com.arunvertex.MyJobPortal.job.Job;
import com.arunvertex.MyJobPortal.job.JobRepository;
import com.arunvertex.MyJobPortal.job.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;


    @Override
    public List<Job> getAllJob() {
        return jobRepository.findAll();

    }

    @Override
    public void createJob(Job job) {

        jobRepository.save(job);

    }

    @Override
    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {

        Job job = jobRepository.findById(id).orElse(null);
        if(job!= null){
            jobRepository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public boolean updateJobById(Long id, Job updatedJob) {

        Optional<Job> jobOptional = jobRepository.findById(id);

        if(jobOptional.isPresent()){

            Job job = jobOptional.get();
            job.setTitle(updatedJob.getTitle());
            job.setDescription(updatedJob.getDescription());
            job.setMinSalary(updatedJob.getMinSalary());
            job.setMaxSalary(updatedJob.getMaxSalary());
            job.setLocation(updatedJob.getLocation());

            jobRepository.save(job);
            return true;
        }
        return false;
    }
}
