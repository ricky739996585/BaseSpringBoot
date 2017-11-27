package com.example.user.service;

import com.example.user.domain.UserVO;

import java.util.List;

public interface UserService {
    public List<UserVO> getAll();
    public UserVO getUser(Integer id);
    public int insert(UserVO user);
    public void update(UserVO user);
    public void delete(Integer id);
}
