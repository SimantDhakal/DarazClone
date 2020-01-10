package com.simant.darazclone.modal;

public class UserModal {
    private String _id;
    private String phoneNo;
    private String password;

    @Override
    public String toString() {
        return "UserModal{" +
                "_id='" + _id + '\'' +
                ",phoneNo='" + phoneNo + '\'' +
                ",password='" + password + '\'' +
                '}';
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModal(String _id, String phoneNo, String password) {
        this._id = _id;
        this.phoneNo = phoneNo;
        this.password = password;
    }

}
