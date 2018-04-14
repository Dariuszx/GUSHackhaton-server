package pl.com.gus.domain.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.com.gus.config.ApplicationConstants;
import pl.com.gus.domain.entity.EurostatBMI;
import pl.com.gus.domain.service.EurostatService;

@Service
public class EurostatServiceImpl implements EurostatService {


    @Override
    public EurostatBMI findBMIStatistics() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(ApplicationConstants.EUROSTAT_BMI, EurostatBMI.class);
    }
}
