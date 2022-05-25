package com.exam.exam.Controlers;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.exam.exam.Entitys.OrffreEmploi;
import com.exam.exam.Reposetories.OrffreEmploiRepository;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controler {

	@Autowired
	OrffreEmploiRepository   orffreEmploiRepository;
  


    @RequestMapping("/")
    public String index(ModelMap modelMap){
        List<OrffreEmploi> Orffre= orffreEmploiRepository.findAll();
        modelMap.addAttribute("Orffres",Orffre);
        return"index";
    }



    @RequestMapping("/chercher")
    public String Chercher(){
        return"index";
    }
    
}
