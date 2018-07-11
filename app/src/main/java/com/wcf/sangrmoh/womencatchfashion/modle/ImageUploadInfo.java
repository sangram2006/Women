package com.wcf.sangrmoh.womencatchfashion.modle;

public class ImageUploadInfo {

    public String imageName;

    public String imageURL;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String name, String url) {

        this.imageName = name;
        this.imageURL = url;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

}
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//public class ImageUploadInfo  {
//
//    public String imageName;
//
//    public String imageURL;
//
////    public String imageSize;
////
////    public String price;
////
////    public String availability;
////
////    public String Offers;
//
//
//    public ImageUploadInfo(String name, String url) {
//        this.imageName = name;
//        this.imageURL = url;
////        this.imageSize = size;
////        this.price = price;
////        this.availability = availability;
////        this.Offers = offers;
//    }
//
////    protected ImageUploadInfo(Parcel in) {
////        imageName = in.readString();
////        imageURL = in.readString();
//////        imageSize = in.readString();
//////        price = in.readString();
//////        availability = in.readString();
//////        Offers = in.readString();
////    }
//
////    public static final Creator<ImageUploadInfo> CREATOR = new Creator<ImageUploadInfo>() {
////        @Override
////        public ImageUploadInfo createFromParcel(Parcel in) {
////            return new ImageUploadInfo(in);
////        }
////
////        @Override
////        public ImageUploadInfo[] newArray(int size) {
////            return new ImageUploadInfo[size];
////        }
////    };
//
//    public String getImageName() {
//        return imageName;
//    }
//
//    public String getImageURL() {
//        return imageURL;
//    }
//
////    @Override
////    public int describeContents() {
////        return 0;
////    }
////
////    @Override
////    public void writeToParcel(Parcel dest, int flags) {
////        dest.writeString(imageName);
////        dest.writeString(imageURL);
//////        dest.writeString(imageSize);
//////        dest.writeString(price);
//////        dest.writeString(availability);
//////        dest.writeString(Offers);
////    }
//}