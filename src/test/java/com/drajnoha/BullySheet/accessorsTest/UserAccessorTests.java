package com.drajnoha.BullySheet.accessorsTest;

import com.drajnoha.BullySheet.dao.accessors.UserAccessor;
import com.drajnoha.BullySheet.dao.accessors.UserAccessorImpl;
import com.drajnoha.BullySheet.dao.entities.User;
import com.drajnoha.BullySheet.dao.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;

/**
 * @author David Rajnoha
 */

@ExtendWith(MockitoExtension.class)
public class UserAccessorTests {


    private UserAccessor userAccessor;
    private final String token = "token";


    @BeforeEach
    void init(@Mock UserRepository userRepository){
        userAccessor = new UserAccessorImpl(userRepository);

        User user = new User();
        user.setToken(token);

        Mockito.lenient().when(userRepository.findOneUserByToken(token)).thenReturn(user);
        Mockito.lenient().when(userRepository.save(any())).then(returnsFirstArg());
    }


    @Test
    void testCreateUser() {
        String token = "token";
        User user = userAccessor.createUser(token);
        assertEquals(token, user.getToken());
    }

    @Test
    void testGetUser() {
        User user = userAccessor.getUser(token);
        assertEquals(token, user.getToken());
    }


}
