package com.gudigar.abhishek.bucket;

public enum BucketName {
	
	PROFILE_IMAGE("abhishek-image-upload-123");
	
	private final String bucketName;

	private BucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketName() {
		return bucketName;
	}
	
}
