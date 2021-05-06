package com.pluralsight.springbatch.patientbatchloader.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.pluralsight.springbatch.patientbatchloader.PatientBatchLoaderApp;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PatientBatchLoaderApp.class)
public class BatchJobConfigurationTest {

    @Autowired
    private Job job;

    @Test
    public void test() {
        assertNotNull(job);
        assertEquals(Constants.JOB_NAME, job.getName());
    }

}
