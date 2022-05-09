package put.response;

import lombok.Data;
import org.onye.model.UserAddressInfo;
import org.onye.model.UsersNames;

import java.util.List;

@Data
public class UserInfoResponse {
    private List<UsersNames> userNames;

    private int usersAge;

    private List<UserAddressInfo> userAddressInfo;
}
