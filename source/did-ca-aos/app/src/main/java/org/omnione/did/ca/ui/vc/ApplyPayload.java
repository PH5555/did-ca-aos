package org.omnione.did.ca.ui.vc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApplyPayload {
    @SerializedName("memberId")
    @Expose
    private String memberId;

    public String getMemberId() {
        return memberId;
    }
}
