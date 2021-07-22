package com.gudigar.abhishek.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.gudigar.abhishek.profile.UserProfile;

@Repository
public class FakeUserProfileDataSource {
	
	private final static List<UserProfile> USER_PROFILES = new ArrayList<>();
	
	static {
		USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Abhishek", null));
		USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Prateeksha", null));
	}

	public List<UserProfile> getUserProfiles() {
		return USER_PROFILES;
	} 
}
