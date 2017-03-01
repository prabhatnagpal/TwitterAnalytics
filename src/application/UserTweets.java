package application;

import java.text.SimpleDateFormat;
import java.util.List;

import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class UserTweets
{
	public static void main(String[] args) throws TwitterException
	{
		ConfigurationBuilder builder = new ConfigurationBuilder();
		builder.setDebugEnabled(true)
		.setOAuthConsumerKey("KqJQ9o57W9ZhzEAA2nLmZ3v9O")
		.setOAuthConsumerSecret("SEeMbOAmmhYI3MoUjzfX4vjid4NZ5djFgIArYUnyzUZqKl9MbT")
		.setOAuthAccessToken("313476459-CSU28kZbN3HefxjwCbhmHZXJ1ZEHmTPxsRBUBzYn")
		.setOAuthAccessTokenSecret("uhnyCHjBeWr1g7OCaTBLBDoteSaJBKVx6yBMIoCxN7eno");
		/*
		Scanner scanner  = new Scanner(System.in);
		
		System.out.print("Enter the keyword for searching in tweets: ");
		String keyword = scanner.nextLine();
		
		TwitterFactory factory = new TwitterFactory(builder.build());
		Twitter twitter = factory.getInstance();
	    Query query = new Query(keyword);
	    QueryResult result = twitter.search(query);
	    for (Status status : result.getTweets())
	    {
	        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
	    }
	    */
	    //Daily Trends
		/*TwitterFactory factory = new TwitterFactory(builder.build());
		Twitter twitter = factory.getInstance();*/
		Twitter twitter = new TwitterFactory().getInstance();
	    List<Trends> trendsList = null;
	    for(Trends trends : trendsList)
	    {
	    	System.out.println("As of "+trends.getAsOf());
	    	for(Trend trend : trends.getTrends())
	    	{
	    		System.out.println(" "+trend.getName());
	    	}
	    }
	}
}
