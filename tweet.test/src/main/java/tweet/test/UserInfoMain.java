package tweet.test;

import java.sql.Date;

import twitter4j.*;

public class UserInfoMain {
	public static void main(String[] args) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        User user = twitter.verifyCredentials();
        System.out.println("ユーザー名 : " + user.getName());
        System.out.println("スクリーンネーム : " + user.getScreenName());
        System.out.println("フレンド数 : " + user.getFriendsCount());
        System.out.println("フォロワー数 : " + user.getFollowersCount());
        
        Status status = twitter.updateStatus(user.getName() + "様の" + "Twitter4Jから初めてのツイート！ #twitter4j");
    }
}