package org.infnet_dr2_tp1.strategy;

import java.util.List;

public class FindUserByIdStrategy implements FindStrategy<User, String>{

    @Override
    public User find(String id, List<User> users) {
        for (User user: users) {
           if(user.getId().equals(id)) return user;
        }
        return null;
    }
}
