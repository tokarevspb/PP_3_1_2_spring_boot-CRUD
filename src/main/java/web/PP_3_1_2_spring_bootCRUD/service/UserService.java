package web.PP_3_1_2_spring_bootCRUD.service;

import web.PP_3_1_2_spring_bootCRUD.model.User;

import java.util.List;

public interface UserService {
    List<User> index();

    void save(User user);

    void delete(long id);

    User show(long id);

    void update(User user);
}
