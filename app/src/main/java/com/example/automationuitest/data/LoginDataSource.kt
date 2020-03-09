package com.example.automationuitest.data

import com.example.automationuitest.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        if (username == "john123" && password == "password123") {
            try {
                // TODO: handle loggedInUser authentication
                val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "John Smith")
                return Result.Success(fakeUser)
            } catch (e: Throwable) {
                return Result.Error(IOException("Error logging in", e))
            }
        }
        return Result.Error(IOException("Incorrect username or password"))
    }

    fun logout() {
        // TODO: revoke authentication
    }
}

