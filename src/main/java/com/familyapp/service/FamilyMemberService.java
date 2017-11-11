package com.familyapp.service;

import com.familyapp.data.FamilyMemberRepository;
import com.familyapp.model.FamilyMemberForm;
import com.familyapp.model.FamilyMembers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyMemberService {

    @Autowired
    private FamilyMemberRepository familyMemberRepository;


    public FamilyMembers create(FamilyMemberForm familyMemberForm) {
        FamilyMembers familyMember = new FamilyMembers();
        familyMember.setFirstName(familyMemberForm.getFirstName());
        familyMember.setLastName(familyMemberForm.getLastName());
        familyMember.setMiddleName(familyMemberForm.getMiddleName());
        familyMember.setMaidenName(familyMemberForm.getMaidenName());

        return familyMemberRepository.save(familyMember);
    }

    public FamilyMembers findOne(Integer id) {
        FamilyMembers familyMember = familyMemberRepository.findOne(id);
        if (familyMember == null) {
            System.err.println();
        }
        return familyMember;
    }

}
