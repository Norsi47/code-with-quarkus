package put.requests;

import lombok.Data;
import org.onye.model.UserAddressInfo;
import org.onye.model.UsersNames;

import java.util.List;

@Data
public class UserInfoRequest {

    private List <UsersNames> usersNames;

    private int usersAge;

    private List <UserAddressInfo> addressInfo;


}
