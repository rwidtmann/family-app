package com.familyapp.controller;

import com.familyapp.data.FamilyMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FamilyController {

    @Autowired
    private FamilyMemberRepository familyMemberRepository;

    @GetMapping("/")
    public String index() {
            //return "home";
            return "home-page/index";
        }


    @RequestMapping("/familyMember")
    public String familyDetails(Model model) {
        //FamilyMember familyMember = new FamilyMember(1, "Bill", "Jamrozik", "Jamrozik", LocalDate.of(1940, 1, 1));
        familyMemberRepository.findMemberByName("Rich");
        // model.addAttribute("familyMember", familyMember);
        return "home";
    }


}

