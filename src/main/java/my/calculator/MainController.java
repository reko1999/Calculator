package my.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired private TestMapper testMapper;

    @GetMapping("/")
    public String home(Model model){
        var datas = testMapper.getDatas();
        model.addAttribute("datas", datas);
        return "home";
    }
}
