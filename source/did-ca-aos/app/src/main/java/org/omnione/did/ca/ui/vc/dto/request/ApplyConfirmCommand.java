package org.omnione.did.ca.ui.vc.dto.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.omnione.did.sdk.datamodel.util.IntEnumAdapterFactory;
import org.omnione.did.sdk.datamodel.util.JsonSortUtil;
import org.omnione.did.sdk.datamodel.util.StringEnumAdapterFactory;

public class ApplyConfirmCommand {
    private String memberId;
    private String proof;
    private String vk;
    private String[] value;

    public ApplyConfirmCommand(String memberId, String proof, String vk, String[] value) {
        this.memberId = memberId;
        this.proof = proof;
        this.vk = vk;
        this.value = value;
    }

    public String toJson() {
        Gson gson = (new GsonBuilder()).registerTypeAdapterFactory(new IntEnumAdapterFactory()).registerTypeAdapterFactory(new StringEnumAdapterFactory()).disableHtmlEscaping().create();
        String json = gson.toJson(this);
        return JsonSortUtil.sortJsonString(gson, json);
    }
}

