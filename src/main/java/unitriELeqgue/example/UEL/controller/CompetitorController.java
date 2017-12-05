package unitriELeqgue.example.UEL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import unitriELeqgue.example.UEL.Util.Log;
import unitriELeqgue.example.UEL.model.Competitor;
import unitriELeqgue.example.UEL.model.Team;
import unitriELeqgue.example.UEL.repository.CompetitorRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/competidor")
public class CompetitorController {
    @Autowired
    CompetitorRepository competitorRepository;

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
        Team team = new Team();
        team.setPlayer1(competitor);

        competitorRepository.save(competitor);
        mv.addObject("captain",competitor);
        mv.addObject("mensagem","salvo com sucesso!");
        mv.addObject("team",team);
        return mv;
    }

    @RequestMapping("/login")
    public String login() { return "login";}

    @RequestMapping("/singin")
    public ModelAndView singin(Log log){
        ModelAndView mv = new ModelAndView("teaminsc");
        List<Competitor> competitorList = competitorRepository.findAll();
        Competitor competitor = new Competitor();
        for(Competitor comp:competitorList)if(comp.getNickname().equals(log.getNickname()))competitor=comp;

        if(competitor.getPassword().equals(log.getPassword())){
            mv.setViewName("login");
            mv.addObject("message","Senha incorreta");
            return mv;
        }
        mv.setViewName("/userplace/home");
        mv.addObject("competitor",competitor);
        return mv;
    }

    @RequestMapping("/page")
    public String home(){
        return "home";
    }

    @RequestMapping("/sobre")
    public String sobre(){
        return "sobre";
    }

}
