package africa.semicolon.LogisticSystem.dto.requests;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String phoneNumber;
    private String password;
}
