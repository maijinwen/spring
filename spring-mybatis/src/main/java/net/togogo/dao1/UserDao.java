package net.togogo.dao1;

import net.togogo.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    void add(User user);
}
