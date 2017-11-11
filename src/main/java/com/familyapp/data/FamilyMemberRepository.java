package com.familyapp.data;

import com.familyapp.model.FamilyMembers;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FamilyMemberRepository extends JpaRepository<FamilyMembers, Integer> {
}
