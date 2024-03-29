package mahmud.sup.galilee.pharmacy.service;

import mahmud.sup.galilee.pharmacy.model.User;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final Map<Long, User> users = new HashMap<>();
    private long userIdSequence = 0L;

    public User addUser(User user) {
        user.setId(++userIdSequence);
        users.put(user.getId(), user);
        return user;
    }

    public List<User> getAllUsers() {
        return users.values().stream().collect(Collectors.toList());
    }
}
