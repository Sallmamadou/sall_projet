package projet_springboot.java.sall_projet.controle;

import projet_springboot.java.sall_projet.model.utilisateur;
import projet_springboot.java.sall_projet.service.utilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    
    @Controller
    @RequestMapping("/personal-info")
    public class utilisateurController {
        @Autowired
        private utilisateurService service;
    
        @GetMapping
        public String list(Model model) {
            List<PersonalInfo> infos = service.getAll();
            model.addAttribute("infos", infos);
            return "personal-info/list";
        }
    
        @GetMapping("/add")
        public String addForm(Model model) {
            model.addAttribute("info", new PersonalInfo());
            return "personal-info/add";
        }
    
        @PostMapping("/add")
        public String save(@ModelAttribute PersonalInfo info) {
            service.save(info);
            return "redirect:/personal-info";
        }
    }teurService service;

    @GetMapping
    public String list(Model model) {
        List<PersonalInfo> infos = service.getAll();
        model.addAttribute("infos", infos);
        return "personal-info/list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("info", new PersonalInfo());
        return "personal-info/add";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute PersonalInfo info) {
        service.save(info);
        return "redirect:/personal-info";
    }
}
