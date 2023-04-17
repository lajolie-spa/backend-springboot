package com.huydeve.lajolie.common;

import com.huydeve.lajolie.contant.StatusCode;

import java.util.HashMap;
import java.util.Map;

public class MessageResponse {
    public static final Map<StatusCode, String>
            MESSAGE = new HashMap<>();
    static {
        MESSAGE.put(StatusCode.INVALID_LOGIN_CREDENTIALS, "Email or password invalid.");
        MESSAGE.put(StatusCode.INVALID_CREDENTIALS, "Token invalid or expired.");
        MESSAGE.put(StatusCode.OK, "Success.");
        MESSAGE.put(StatusCode.ROOM_EXISTED, "Meeting existed.");
        MESSAGE.put(StatusCode.ROOM_NOT_EXISTED, "Meeting not existed.");
        MESSAGE.put(StatusCode.UNEXPECTED, "Unexpected error occur.");
        MESSAGE.put(StatusCode.EMAIL_EXISTED, "Email existed.");
        MESSAGE.put(StatusCode.OLD_PASSWORD_INCORRECT, "Old password incorrect.");
        MESSAGE.put(StatusCode.NOT_HAVE_PERMISSION, "User not have permission.");
        MESSAGE.put(StatusCode.ROOM_REACH_LIMIT, "Meeting reach limit.");
        MESSAGE.put(StatusCode.USERNAME_TAKEN, "Username was taken.");
        MESSAGE.put(StatusCode.USERNAME_REQUIRED, "Username is required.");
        MESSAGE.put(StatusCode.INVITE_NOT_EXISTED, "Invite not existed.");
        MESSAGE.put(StatusCode.BAD_REQUEST, "Bad request.");
        MESSAGE.put(StatusCode.ROOM_CODE_INVALID, "Meeting code is invalid.");
        MESSAGE.put(StatusCode.USER_NOT_EXISTED, "User not existed.");
        MESSAGE.put(StatusCode.USER_NOT_AUTHORIZED, "User not authorized.");
        MESSAGE.put(StatusCode.AUTHOR_NOT_EXISTED, "Author not existed.");
        MESSAGE.put(StatusCode.CONTACT_EXISTED, "Contact existed.");
        MESSAGE.put(StatusCode.CONTACT_NOT_EXISTED, "Contact not existed.");
        MESSAGE.put(StatusCode.INVALID_FROM_OR_TO, "Invalid From or To param. To must be later than From.");
        MESSAGE.put(StatusCode.POST_NOT_EXISTED, "The post does not exist.");
        MESSAGE.put(StatusCode.USER_NOT_AUTHOR_POST, "The user is not the author of the post or has insufficient permissions.");
        MESSAGE.put(StatusCode.PACKAGE_NOT_EXISTING, "The package is not existed.");
        MESSAGE.put(StatusCode.ONLY_USER_CAN_FOLLOW, "Only users can follow.");
        MESSAGE.put(StatusCode.ONLY_CAN_FOLLOW_WRITER, "Can only follow the writer.");
        MESSAGE.put(StatusCode.FOLLOW_EXISTED, "Followed before.");
        MESSAGE.put(StatusCode.FOLLOW_NOT_EXISTED, "Follow not exsited.");
        MESSAGE.put(StatusCode.WALLET_ALREADY_EXISTED, "The user already have a wallet, each user can only own one wallet.");
        MESSAGE.put(StatusCode.WALLET_NOT_EXISTED, "The not existed.");
        MESSAGE.put(StatusCode.USER_ALREADY_PREMIUM, "User is already a premium user, can't subscribe to the packages now.");
        MESSAGE.put(StatusCode.USER_NOT_PREMIUM_CAN_NOT_VOTE_POST, "This is a premium post, only premium users can vote for this post, become premium user to vote.");
        MESSAGE.put(StatusCode.OUT_OF_RANGE_VOTE, "Voting only between 0 and 5.");
        MESSAGE.put(StatusCode.POST_NOT_PREMIUM, "Post is note premium post.");
        MESSAGE.put(StatusCode.BONUS_NOT_EXISTED, "Bonus not existed.");
        MESSAGE.put(StatusCode.BONUS_HAS_WITHDRAWN_BEFORE, "Bonus has been withdrawn before.");
        MESSAGE.put(StatusCode.NOW_CAN_NOT_WITHDRAW_BONUS, "Now can't withdraw bonus.");
    }
}
