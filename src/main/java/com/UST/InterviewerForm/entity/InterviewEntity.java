package com.UST.InterviewerForm.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="interview_tab")
public class InterviewEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long Id;
//    private String name;
//    private String role;
//    private String skills;
//    private int experience;
//    private String time;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Role is required")
    private String role;

    @NotBlank(message = "Skills is required")
    private String skills;

    @NotNull(message = "Experience is required")
    @Min(value = 0, message = "Experience must be at least 0")
    private Integer experience;

    @NotNull(message = "Time is required")
    @Pattern(regexp = "^([01]\\d|2[0-3]):[0-5]\\d$", message = "Time must be in the format HH:mm")
    private String time;

    @NotNull(message = "Available date is required")
    @FutureOrPresent(message = "Available date should be present or future")

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date availableDate;

}
