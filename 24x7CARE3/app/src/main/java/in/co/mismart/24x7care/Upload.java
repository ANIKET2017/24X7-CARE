package in.co.mismart.azim24x7care;

public class Upload {
    private String mName;
    private String mImageUrl;


    public Upload() {
        //empty constructor
    }

    public Upload(String name,String imageurl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageurl;
    }

    public String getmName(){
        return mName;
    }

    public void setmName(String name) {
        mName = name;
    }

    public String getmImageUrl() {
        return mImageUrl;

    }

    public void setmImageUrl(String imageUrl){
        mImageUrl = imageUrl;
    }
}
