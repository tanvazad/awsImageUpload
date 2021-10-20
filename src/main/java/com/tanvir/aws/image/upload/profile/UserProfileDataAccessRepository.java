package com.tanvir.aws.image.upload.profile;

import com.tanvir.aws.image.upload.datastore.InMemoryUserProfileData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessRepository {

    private final InMemoryUserProfileData inMemoryUserProfileData;

    @Autowired
    public UserProfileDataAccessRepository(InMemoryUserProfileData inMemoryUserProfileData) {
        this.inMemoryUserProfileData = inMemoryUserProfileData;
    }

    List<UserProfile> getUserProfiles(){
        return inMemoryUserProfileData.getUserProfiles();
    }
}
