package org.omnione.did.ca.ui.vc.dto;

public class LicenseVc extends BaseVc{
    private String pid;
    private String license;
    private String expired;

    public String getPid() {
        return pid;
    }

    public String getLicense() {
        return license;
    }

    public String getExpired() {
        return expired;
    }
}
