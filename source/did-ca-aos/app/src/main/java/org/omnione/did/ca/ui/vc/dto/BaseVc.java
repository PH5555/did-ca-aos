package org.omnione.did.ca.ui.vc.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.omnione.did.ca.logger.CaLog;

public class BaseVc {
    protected String ci;
    protected String name;

    public static boolean checkVcFormat(String data, ResumeType resumeType) {
        try{
            if (resumeType == ResumeType.EDUCATION) {
                tryMappingVc(EducationVc.class, data);
                return true;
            }
            else if(resumeType == ResumeType.EXPERIENCE) {
                tryMappingVc(ExperienceVc.class, data);
                return true;
            }
            else if(resumeType == ResumeType.LICENSE) {
                tryMappingVc(LicenseVc.class, data);
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }


    public static EducationVc mappingEducation(String data) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(data, EducationVc.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("변환 실패");
        }
    }

    public static ExperienceVc mappingExperience(String data) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(data, ExperienceVc.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("변환 실패");
        }
    }

    public static LicenseVc mappingLicense(String data) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(data, LicenseVc.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("변환 실패");
        }
    }

    private static Object tryMappingVc(Class<?> target, String data) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(data, target);
        } catch (JsonProcessingException e) {
            CaLog.d("snark: " + e.getMessage());
            throw new RuntimeException("변환 실패");
        }
    }

    public String getCi() {
        return ci;
    }

    public String getName() {
        return name;
    }
}
