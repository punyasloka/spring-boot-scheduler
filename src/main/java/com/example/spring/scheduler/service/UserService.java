package com.example.spring.scheduler.service;

import com.example.spring.scheduler.dao.UserDao;
import com.example.spring.scheduler.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    @Scheduled(fixedRate = 5000)
    public void addToDB() {
        User user = new User();
//        user.setId(new Random().nextInt(1000));
        user.setName("testUser " + new Random().nextInt(374483));
        userDao.save(user);
        System.out.println("Add service call in " + new Date().toString());
    }

    @Scheduled(cron = "0/15 * * * * *")
    public void fetchDB() {
        List<User> userList = userDao.findAll();
        System.out.println("Fetch Service call in " + new Date().toString());
        System.out.println("no. of records fetched :" + userList.size());
        log.info("users :{}", userList);
    }
}
