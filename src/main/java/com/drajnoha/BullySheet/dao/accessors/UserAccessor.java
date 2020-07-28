package com.drajnoha.BullySheet.dao.accessors;

import com.drajnoha.BullySheet.dao.entities.User;

/**
 * @author David Rajnoha
 */
public interface UserAccessor {

    /**
     * Creates a user given a token
     * @param token identifying the user
     * @return the created user
     */
    User createUser(String token);

    /**
     * Gets user based by the token
     */
    User getUser(String token);
}
