package tanmay.sharma.interviewbitclone.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import tanmay.sharma.interviewbitclone.utils.Constants;

import java.util.UUID;

@Getter
@Setter
public class User {
    private UUID uuid;
    private String name;
    private Constants.Gender gender;

    public User(String name, Constants.Gender gender){
        uuid=UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }

}
