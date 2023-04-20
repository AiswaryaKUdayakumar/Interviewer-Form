package com.UST.InterviewerForm.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

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


    @NotBlank(message = "Interviewer ID is required")
    @Pattern(regexp = "^UST\\d{6}$", message = "Interviewer ID must be in the format UST followed by 6 digits")
    private String interviewerId;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@ust\\.com$", message = "Email must be a UST email")
    private String email;

    @NotBlank(message = "Role is required")
    @Pattern(regexp = "^(developer|analyst|tester)$", message = "Role must be developer, analyst, or tester")
    private String role;

//    public enum Role {
//        DEVELOPER,
//        TESTER,
//        ANALYST
//    }
//    @ElementCollection(targetClass = Role.class)
//    @Enumerated(EnumType.STRING)
//    private Set<Role> role;

   /* @NotBlank(message = "Roles are required")
    @Size(min = 1, message = "At least one role must be selected")
    @Column(columnDefinition = "set('developer','analyst','tester')")
    private Set<String> role;)*/

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
