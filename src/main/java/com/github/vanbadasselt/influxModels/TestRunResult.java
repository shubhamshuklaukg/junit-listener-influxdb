package com.github.vanbadasselt.influxModels;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;
import org.influxdb.annotation.TimeColumn;

import java.time.Instant;

@SuppressFBWarnings("URF_UNREAD_FIELD")
@SuppressWarnings("PMD.UnusedPrivateField")
@Measurement(name = "test_Suite_Results")
public class TestRunResult {

    @TimeColumn
    @Column(name = "time")
    private Instant time;

    @Column(name = "application")
    private String application;

    @Column(name = "applicationType")
    private String applicationType;

    @Column(name = "durationMs")
    private long durationMs;

    @Column(name = "releaseVersion")
    private String releaseVersion;

    @Column(name = "result")
    private String result;

    @Column(name = "run")
    private String run;

    @Column(name = "testCasesFailed")
    private long testCasesFailed;

    @Column(name = "testCasesSkipped")
    private long testCasesSkipped;

    @Column(name = "testCasesTotal")
    private long testCasesTotal;

    @Column(name = "featureName")
    private String featureName;

    @Column(name = "testType")
    private String testType;

    @Column(name = "dsEnv")
    private String dsEnv;

    @Column(name = "region")
    private String region;

    private static final String UNKNOWN = "UNK";
    private static final String APPLICATION_TYPE_BACKEND = "BE";

    public TestRunResult(){
        this.application = "ds-tests";
        this.applicationType = "Datascience Tests";
        this.durationMs = 0;
        this.releaseVersion = UNKNOWN;
        this.result = UNKNOWN;
        this.run = UNKNOWN;
        this.featureName = UNKNOWN;
        this.testCasesFailed = 0;
        this.testCasesSkipped = 0;
        this.testCasesTotal = 0;
        this.dsEnv = UNKNOWN;
        this.region = UNKNOWN;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public void setDurationMs(long durationMs) {
        this.durationMs = durationMs;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public void setTestCasesTotal(long testCasesTotal) {
        this.testCasesTotal = testCasesTotal;
    }

    public void setTestCasesFailed(long testCasesFailed) {
        this.testCasesFailed = testCasesFailed;
    }

    public void setTestCasesSkipped(long testCasesSkipped) {
        this.testCasesSkipped = testCasesSkipped;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
    public void setDSEnv(String dsEnv) {
        this.dsEnv = dsEnv;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
