package web.PP_3_1_2_spring_bootCRUD.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import web.PP_3_1_2_spring_bootCRUD.dao.UserDAO;
import web.PP_3_1_2_spring_bootCRUD.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDAO userDAO;

    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public void delete(long id) {
        userDAO.delete(id);
    }

    @Override
    @Transactional
    public User show(long id) {
        return userDAO.show(id);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDAO.update(user);
    }
}
