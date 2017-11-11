package com.familyapp.controller;

import com.familyapp.data.FamilyMemberRepository;
import com.familyapp.model.FamilyMemberForm;
import com.familyapp.model.FamilyMembers;
import com.familyapp.service.FamilyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FamilyController {

    @Autowired
    FamilyMemberService familyMemberService;

    @Autowired
    private FamilyMemberRepository familyMemberRepository;

    @GetMapping("/")
    public String index() {
            return "home-page/index";
        }


    @GetMapping("/member-lookup")
    public String memberLookupForm(Model model) {
        model.addAttribute("familyMember", new FamilyMembers());
        return "member-lookup/familyMemberLookupByNameForm";
    }

    @PostMapping("/member-lookup")
    public String memberLookupSubmit(@ModelAttribute FamilyMembers familyMember) {
        return "member-lookup/memberLookupResult";
    }

    @GetMapping("/id-lookup")
    public String idLookupForm(Model model) {
        model.addAttribute("familyMember", new FamilyMembers());
        return "id-lookup/familyMemberLookupByIdForm";
    }

    @PostMapping("/id-lookup")
    public String idLookupSubmit(@ModelAttribute FamilyMembers familyMember) {
        return "id-lookup/idLookupResult";
    }

    @GetMapping("/create-member")
    public String createMemberForm(Model model) {
        model.addAttribute("familyMemberForm", new FamilyMemberForm());
        return "create-member/createMemberForm";
    }

    @PostMapping("/create-member")
    public String createMemberSubmit(@ModelAttribute FamilyMemberForm familyMemberForm) {
        familyMemberService.create(familyMemberForm);
        return "redirect:/";
    }

}

