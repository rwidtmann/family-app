package com.familyapp.data;


import com.familyapp.model.FamilyMember;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class FamilyMemberRepository {
    private static final List<FamilyMember> FAMILY_MEMBERS = Arrays.asList(
            new FamilyMember(1, "Richard", "Widtmann", "John", "Widtmann", LocalDate.of(1965,8,27)),
            new FamilyMember(1, "Jennifer", "Widtmann", "Rae", "Jamrozik", LocalDate.of(1968,5,30))
    );

    public List<FamilyMember> getAllFamilyMembers () {
        return FAMILY_MEMBERS;
    }

    public FamilyMember findMemberByName(String name) {
        FamilyMember member = new FamilyMember();
       return member = (FamilyMember) FAMILY_MEMBERS.stream()
                .filter(familyMember -> familyMember.getFirstName().equals(name))
               .findFirst()
               .orElse(null);
        

//        for (FamilyMember member : FAMILY_MEMBERS) {
//            return member;
//        }
      //  return null;
    }
}
