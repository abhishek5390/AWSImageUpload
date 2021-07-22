package com.gudigar.abhishek.profile;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/image-upload")
public class UserProfileController {
	
	private final UserProfileService profileService;
	
	
	public UserProfileController(UserProfileService profileService) {
		this.profileService = profileService;
	}

	@GetMapping
	public List<UserProfile> getAllUserProfiles() {
		return profileService.getAllUserProfiles();
	}

}
