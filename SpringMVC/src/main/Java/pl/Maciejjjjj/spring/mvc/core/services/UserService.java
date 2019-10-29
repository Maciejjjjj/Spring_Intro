package pl.Maciejjjjj.spring.mvc.core.services;

import org.springframework.stereotype.Service;
import pl.Maciejjjjj.spring.doamin.User;
import pl.Maciejjjjj.spring.doamin.UserDTO;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private AtomicLong nextUserId = new AtomicLong();
    private ConcurrentHashMap<Long, User> users = new ConcurrentHashMap<>();

    public Long saveUser(UserDTO userDTO) {
        User user = new User();

        user.setId(nextUserId.getAndIncrement());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setAge(userDTO.getAge());
        user.setGender(userDTO.getGender());

        user.setVersionId(1L);
        user.setCreationDate(LocalDateTime.now());

        user.setLastModificationDate(user.getCreationDate());

        users.put(user.getId(), user);

        return user.getId();
    }

    public UserDTO getUser(Long id) {

        User user = users.get(id);
        if (user == null) {
            return null;
        }

        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                user.getGender(),
                user.getVersionId()
        );

        return userDTO;

    }

}
