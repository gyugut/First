package com.example.first;

/**
 * User infomation model class
 */
public class UserAccount {
    private String UserID;
    private String UserPW;
    //private String UserNumber;
    //private String UserName;
    private String IdToken; // Firebase UID (User Key Value)


    // basic constructor
    public UserAccount() { }

    //getter, setter
    public String getUserID() { return UserID; }
    public void setUserID(String userID) { this.UserID = userID; }
    public String getUserPW() {return UserPW;}
    public void setUserPW(String userPw) {this.UserPW = userPw;}
    //public String getUserNumber() {return UserNumber;}
    //public void setUserNumber(String userNum) {this.UserNumber = userNum;}
    public String getIdToken() {return IdToken;}
    public void setIdToken(String idToken) {this.IdToken = idToken; }

}
