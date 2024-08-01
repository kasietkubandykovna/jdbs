package model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private  Long id;
    private String firsName;
    private String email;

    public User(String firsName, String email) {
        this.firsName = firsName;
        this.email = email;
    }
}
