package com.gudigar.abhishek.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gudigar.abhishek.datastore.FakeUserProfileDataSource;

@Repository
public class UserProfileDataAccessService {
	
	private final FakeUserProfileDataSource fakeUserProfileDataSource;
	
	@Autowired
	public UserProfileDataAccessService(FakeUserProfileDataSource fakeUserProfileDataSource) {
		this.fakeUserProfileDataSource = fakeUserProfileDataSource;
	}
	
	public List<UserProfile> getAllUserProfiles(){
		return fakeUserProfileDataSource.getUserProfiles();
	}

}	
