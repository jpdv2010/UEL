package unitriELeqgue.example.UEL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import unitriELeqgue.example.UEL.model.Competitor;
import unitriELeqgue.example.UEL.model.Team;
import unitriELeqgue.example.UEL.repository.Competitors;

import javax.validation.Valid;

@Controller
@RequestMapping("/competidor")
public class CompetitorController {
    @Autowired
    Competitors competitors;

    @RequestMapping("/novo")
    public ModelAndView newCompetitor(){
        ModelAndView mv=new ModelAndView("cadastro");
        mv.addObject("competitor",new Competitor());
        return mv;
    }

    @RequestMapping
    public ModelAndView save(@Valid Competitor competitor, BindingResult bindingResult){
        ModelAndView mv=new ModelAndView("teaminsc");
        if(bindingResult.hasErrors()){
            mv.setViewName("cadastro");
            return mv;
        }

        competitors.save(competitor);
        mv.addObject("captain",competitor);
        mv.addObject("mensagem","salvo com sucesso!");
        mv.addObject("team",new Team());
        return mv;
    }

    @RequestMapping("/page")
    public String home(){
        return "home";
    }

}
