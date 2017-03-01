package application;

import java.util.List;
import java.util.Scanner;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class FirstTwitterApp
{
	public static void main(String[] args) throws TwitterException
	{
		ConfigurationBuilder builder = new ConfigurationBuilder();
		builder.setDebugEnabled(true)
		.setOAuthConsumerKey("KqJQ9o57W9ZhzEAA2nLmZ3v9O")
		.setOAuthConsumerSecret("SEeMbOAmmhYI3MoUjzfX4vjid4NZ5djFgIArYUnyzUZqKl9MbT")
		.setOAuthAccessToken("313476459-CSU28kZbN3HefxjwCbhmHZXJ1ZEHmTPxsRBUBzYn")
		.setOAuthAccessTokenSecret("uhnyCHjBeWr1g7OCaTBLBDoteSaJBKVx6yBMIoCxN7eno");
		
		TwitterFactory factory = new TwitterFactory(builder.build());
		Twitter twitter = factory.getInstance();
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.print("Enter the keyword for searching in tweets: ");
		String keyword = scanner.nextLine();
		int counter=0;
		Query query = new Query(keyword);
	    QueryResult result = twitter.search(query);
	    for (Status status : result.getTweets())
	    {
	    	counter++;
	        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
	    }
		System.out.println("\n"+counter+" current tweets");
		/*List<Status> status = twitter.getHomeTimeline();
		for(Status st : status)
		{
			System.out.println(st.getUser().getName()+"------->"+st.getText());
		}*/
	}
}
