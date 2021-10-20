package com.tanvir.aws.image.upload.bucket;

public enum BucketName {

    PROFILE_IMAGE("tanvir-aws-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName(){
        return bucketName;
    }
}
