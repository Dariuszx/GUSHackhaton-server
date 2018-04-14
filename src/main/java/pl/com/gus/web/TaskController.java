package pl.com.gus.web;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TaskController {


}
