package com.Ov2App.Web.Controllers;

import com.Ov2App.Web.Data.DummyData;
import com.Ov2App.Web.Model.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InfoController {
    @GetMapping("/info")
    public String infofrom(Model model){
        model.addAttribute("info", new Info());
        model.addAttribute("selectedTrip", DummyData.getDummyData().get(0));
        return "info";
    }

    @PostMapping("/info")
    public String infoSubmit(@ModelAttribute Info info, Model model) {
        if(info.getInputA().equals(info.getInputB())){
            info.setTest("hetzelfde");
        }
        else{
            info.setTest("niet hetzelfde");
        }
        model.addAttribute("info", info);

        model.addAttribute("selectedTrip", DummyData.getDummyData().get(0));
        return "info";
    }
}
