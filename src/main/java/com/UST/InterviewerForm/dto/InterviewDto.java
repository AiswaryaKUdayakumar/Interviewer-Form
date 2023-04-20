package com.UST.InterviewerForm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class InterviewDto {

        private Long id;

        @NotBlank(message = "Name is required")
        @Pattern(regexp = "\\S+", message = "Name cannot be blank")
        @NotNull(message = "username shouldn't be null")
        private String name;

        @NotBlank(message = "Role is required")
        private String role;

        @NotBlank(message = "Skills is required")
        private String skills;

        @NotBlank(message="Experience is required")
        private int experience;

        @NotBlank(message = "Time is required")
        private String time;

//        public InterviewDto() {}


}
