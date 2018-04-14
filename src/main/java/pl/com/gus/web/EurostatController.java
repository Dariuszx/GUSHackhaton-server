package pl.com.gus.web;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.gus.domain.entity.EurostatBMI;
import pl.com.gus.domain.service.EurostatService;

@RestController
@RequestMapping("/api/eurostat/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EurostatController {

    private final EurostatService eurostatService;

    @RequestMapping(value = "/bmi", method = RequestMethod.GET)
    public EurostatBMI findBMI() {
        return eurostatService.findBMIStatistics();
    }

}
