package guru.springframework.api.controller;

import guru.springframework.api.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class UserController {

    private ApiService apiService;


    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"","/","/index"})
    public String index() {
        return "index";
    }

    @PostMapping("users")
    public String formPost(Model model, @RequestParam Integer limit) {

        if (limit == null || limit == 0) {
            log.debug("Setting limit to default of 10");
            limit = 10;
        } else if (limit > 1) {
            limit -= 1;
        }
        model.addAttribute("users", apiService.getUsers(limit));

        return "userlist";
    }
}
