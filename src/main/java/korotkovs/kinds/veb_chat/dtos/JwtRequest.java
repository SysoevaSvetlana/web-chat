package korotkovs.kinds.veb_chat.dtos;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
