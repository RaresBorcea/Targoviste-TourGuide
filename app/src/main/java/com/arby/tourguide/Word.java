package com.arby.tourguide;

/**
 * Created by rares on 26.07.2017.
 */

public class Word {
    private String mName;
    private String mLocation;
    private String mOpen;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String name, String location, String open) {
        mName = name;
        mLocation = location;
        mOpen = open;
    }

    public Word(String name, String location, String open, int imageResourceId) {
        mName = name;
        mLocation = location;
        mOpen = open;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getOpen() {
        return mOpen;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
