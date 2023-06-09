package kimch321.springboot.semiprojcectv5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/gallery")
public class GalleryController {

    @GetMapping("/list")
    public ModelAndView list(@RequestParam int cpg) {
        ModelAndView mv = new ModelAndView();

        mv.addObject("cpg",cpg);
        mv.addObject("stpg",((cpg-1)/10)*10 + 1);
        mv.setViewName("gallery/list.tiles");
        return mv;
    }

}
