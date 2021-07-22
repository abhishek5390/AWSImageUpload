package com.gudigar.abhishek.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
	
	private final UserProfileDataAccessService userProfileDataAccessService;
	
	@Autowired
	public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
		this.userProfileDataAccessService = userProfileDataAccessService;
	}
	
	public List<UserProfile> getAllUserProfiles(){
		return userProfileDataAccessService.getAllUserProfiles();
	}

	
}
