package com.candidjava.SpringJpaMySQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candidjava.SpringJpaMySQL.model.User;
import com.candidjava.SpringJpaMySQL.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
    UserRepository userRepository;

    public void createUser(User user) {
        // TODO Auto-generated method stub
        userRepository.save(user);
    }

    public List<User> getUser() {
        // TODO Auto-generated method stub
        return (List<User>) userRepository.findAll();
    }

    public User findById(long id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).get();
    }

    public User update(User user, long l) {
        // TODO Auto-generated method stub
        return userRepository.save(user);
    }

    public void deleteUserById(long id) {
        // TODO Auto-generated method stub
        userRepository.deleteById(id);
    }

    public User updatePartially(User user, long id) {
        // TODO Auto-generated method stub
        User usr = findById(id);
        usr.setCountry(user.getCountry());
        return userRepository.save(usr);
    }
}
