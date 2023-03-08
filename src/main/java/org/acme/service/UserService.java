package org.acme.service;

import org.acme.domain.User;


public interface UserService {
    User loginService(String uname, String password);

    User registService(User user);
}
