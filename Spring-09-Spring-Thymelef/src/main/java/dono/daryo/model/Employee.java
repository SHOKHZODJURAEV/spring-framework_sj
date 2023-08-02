package dono.daryo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String department;
    private boolean vaccinated;
    private String company;
}
