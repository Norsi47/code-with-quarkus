package Response;

import lombok.Data;
import org.onye.model.UserAddressInfo;
import org.onye.model.UsersNames;

import java.util.List;

@Data
public class UserInfoResponse {
    private List<UsersNames> userNames;

    private String userAge;

    private List<UserAddressInfo> userAddressInfo;
}
