package unitriELeqgue.example.UEL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import unitriELeqgue.example.UEL.model.Competitor;
import unitriELeqgue.example.UEL.model.Team;
import unitriELeqgue.example.UEL.repository.Teams;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/time")
public class TeamController {
    @Autowired
    Teams teams;

    @RequestMapping("/createorjoin")
    public ModelAndView createOrJoin(){
        ModelAndView mv=new ModelAndView("teampage");
        List<Team> teamList=teams.findAll();
        mv.addObject("teamList",teamList);
        return mv;
    }

    @RequestMapping
    public ModelAndView create(@Valid Team team, BindingResult bindingResult){
        ModelAndView mv=new ModelAndView("teampage");
        if(bindingResult.hasErrors()){
            Competitor competitor=new Competitor();
            competitor.setNickname("..");
            mv.addObject("captain",competitor);
            mv.setViewName("teaminsc");
            return mv;
        }
        teams.save(team);
        mv.addObject("mensagem","salvo com sucesso!");
        List<Team> teamList=teams.findAll();
        mv.addObject("teamList",teamList);
        return mv;
    }

}
