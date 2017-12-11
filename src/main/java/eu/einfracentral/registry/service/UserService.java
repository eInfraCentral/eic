package eu.einfracentral.registry.service;

import eu.einfracentral.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by pgl on 07/08/17.
 */
@Service("userService")
public interface UserService extends ResourceService<User> {
    User activate(String id);
    User reset(User user);
    User register(User user);
    User forgot(String email);
    String getToken(User user);
    boolean authenticate(User credentials);
    User getUserByEmail(String email);
    User addFavourite(String userID, String serviceID);
}
