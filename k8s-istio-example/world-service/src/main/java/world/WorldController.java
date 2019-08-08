package world;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @Value("${message}")
    private String message;

    @RequestMapping("/")
    public String getData() {
        return message;
    }

}
