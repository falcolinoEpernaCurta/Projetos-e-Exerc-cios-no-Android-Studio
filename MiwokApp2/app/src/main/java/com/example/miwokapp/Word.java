package com.example.miwokapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_RESOURCE;
    private int mSoundResourceId = NO_RESOURCE;

    private static int NO_RESOURCE = -1;

    public Word(String englishTranslation, String miwokTranslation, int vImageResourceId, int vSoundResourceId){
        this.mDefaultTranslation = englishTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = vImageResourceId;
        this.mSoundResourceId = vSoundResourceId;
    }


    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }

    public Word(String englishTranslation, String miwokTranslation, int vSoundResourceId){
        this.mDefaultTranslation = englishTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mSoundResourceId = vSoundResourceId;
    }

    public String getDefaultTranslation() {return mDefaultTranslation;}

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getSoundResourceId(){return mSoundResourceId;}

    public boolean hasImage() {
        return mImageResourceId != NO_RESOURCE;
    }
}
