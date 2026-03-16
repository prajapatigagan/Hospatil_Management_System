package com.gagan.Hospatil_Management_System.dto;

import com.gagan.Hospatil_Management_System.entity.type.BloodGroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupCountResponceEntity {

    private BloodGroupType bloodGroupType;
    private Long count;

}