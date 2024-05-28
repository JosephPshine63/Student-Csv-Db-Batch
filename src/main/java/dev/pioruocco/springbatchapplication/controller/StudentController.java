package dev.pioruocco.springbatchapplication.controller;

import dev.pioruocco.springbatchapplication.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/batch/students")
public class StudentController {

    private final JobLauncher jobLauncher;
    private final Job job;

    @PostMapping
    public void importCsvsToDatabase() throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("StartAt: ", System.currentTimeMillis())
                .toJobParameters();

        jobLauncher.run(job, jobParameters);
    }

}
