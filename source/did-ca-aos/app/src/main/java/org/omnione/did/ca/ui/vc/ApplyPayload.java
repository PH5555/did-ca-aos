package org.omnione.did.ca.ui.vc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class ApplyPayload {
    @SerializedName("applicationId")
    @Expose
    private String applicationId;
    @SerializedName("majorRequirement")
    @Expose
    private String majorRequirement;
    @SerializedName("educationRequirement")
    @Expose
    private String educationRequirement;
    @SerializedName("licenseRequirement")
    @Expose
    private List<String> licenseRequirement;
    @SerializedName("experienceRequirement")
    @Expose
    private int experienceRequirement;

    @SerializedName("createdAt")
    @Expose
    private LocalDateTime createdAt;

    public String getApplicationId() {
        return applicationId;
    }

    public String getMajorRequirement() {
        return majorRequirement;
    }

    public String getEducationRequirement() {
        return educationRequirement;
    }

    public List<String> getLicenseRequirement() {
        return licenseRequirement;
    }

    public int getExperienceRequirement() {
        return experienceRequirement;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
