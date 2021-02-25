package com.supportportal.domain;

public class ResetPassword {
    private String userMail;
    private String oldPassword;
    private String newPassword;
    private String confirmPassword;

    public ResetPassword(String userMail, String oldPassword, String newPassword, String confirmPassword) {
        this.userMail = userMail;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
