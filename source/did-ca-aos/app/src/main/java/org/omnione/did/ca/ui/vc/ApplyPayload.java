package org.omnione.did.ca.ui.vc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApplyPayload {
    @SerializedName("memberId")
    @Expose
    private String applicationId;
    @SerializedName("major1")
    @Expose
    private String major1;
    @SerializedName("major2")
    @Expose
    private String major2;
    @SerializedName("major3")
    @Expose
    private String major3;
    @SerializedName("univType1")
    @Expose
    private String univType1;
    @SerializedName("univType2")
    @Expose
    private String univType2;
    @SerializedName("currentTime")
    @Expose
    private String currentTime;
    @SerializedName("employPeriod")
    @Expose
    private String employPeriod;
    @SerializedName("license")
    @Expose
    private String license;

    public String getApplicationId() {
        return applicationId;
    }

    public String getMajor1() {
        return major1;
    }

    public String getMajor2() {
        return major2;
    }

    public String getMajor3() {
        return major3;
    }

    public String getUnivType1() {
        return univType1;
    }

    public String getUnivType2() {
        return univType2;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public String getEmployPeriod() {
        return employPeriod;
    }

    public String getLicense() {
        return license;
    }
}
