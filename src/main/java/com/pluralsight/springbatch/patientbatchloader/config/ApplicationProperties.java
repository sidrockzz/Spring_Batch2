package com.pluralsight.springbatch.patientbatchloader.config;

import org.hibernate.engine.jdbc.batch.spi.Batch;
import org.hibernate.engine.jdbc.batch.spi.BatchKey;
import org.hibernate.engine.jdbc.batch.spi.BatchObserver;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.sql.PreparedStatement;

/**
 * Properties specific to Patient Batch Loader.
 * <p>
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private  final Batch batch = new Batch();
    public Batch getBatch(){
        return batch;
    }
    public static class Batch{
        private String inputPath = "/home/siddharth/Desktop/FirstSpring/patient-batch-loader-start/data";

        public String getInputPath(){
            return this.inputPath;
        }

        public void setInputPath(String inputPath){
            this.inputPath = inputPath;
        }
    }
}
