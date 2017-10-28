package com.familyapp.controller;

import com.familyapp.model.FamilyMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FamilyController {

    //@Autowired
    //private FamilyMemberRepository familyMemberRepository;

    @GetMapping("/")
    public String index() {
            //return "home";
            return "home-page/index";
        }


    @GetMapping("/member-lookup")
    public String memberLookupForm(Model model) {
        model.addAttribute("familyMember", new FamilyMember());
        return "familyMemberLookupByNameForm";
    }


    @PostMapping("/member-lookup")
    public String memberLookupSubmit(@ModelAttribute FamilyMember familyMember) {
        return "result";
    }

}

