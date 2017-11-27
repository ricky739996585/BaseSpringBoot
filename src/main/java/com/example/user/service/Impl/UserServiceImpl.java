package com.example.user.service.Impl;

import com.example.user.dao.UserVOMapper;
import com.example.user.domain.UserVO;
import com.example.user.domain.UserVOExample;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserVOMapper userVOMapper;

    @Override
    public List<UserVO> getAll() {
        UserVOExample example=new UserVOExample();
        example.createCriteria().andIdIsNotNull();
        return userVOMapper.selectByExample(example);
    }

    @Override
    public UserVO getUser(Integer id) {
        return userVOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(UserVO user) {

        return userVOMapper.insertSelective(user);
    }

    @Override
    public void update(UserVO user) {
        userVOMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(Integer id) {
        userVOMapper.deleteByPrimaryKey(id);
    }
}
