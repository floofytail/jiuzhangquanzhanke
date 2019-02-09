package com.mycompany.myapp.domain.dto;

import com.mycompany.myapp.domain.Course;
import com.mycompany.myapp.domain.User;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCourseDto {

    private Course course;
    private User user;

}
