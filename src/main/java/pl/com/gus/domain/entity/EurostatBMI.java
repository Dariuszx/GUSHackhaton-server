package pl.com.gus.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EurostatBMI {

    private String version;
    private String label;
    private Map<String, String> value;
}
