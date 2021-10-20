package com.tanvir.aws.image.upload.datastore;

import com.tanvir.aws.image.upload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class InMemoryUserProfileData {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.fromString("a4ac7b7f-a20d-4688-bb01-e6e1b50e9dfd"),"tanvir",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("709b76e8-256e-4574-a360-85db1adb0c12"),"azad",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
