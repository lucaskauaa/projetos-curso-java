package application;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) {
		
		Post post01 = new Post(LocalDateTime.parse("2018-06-21T13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		
		post01.addComments(new Comment("Have a nice trip"));
		post01.addComments(new Comment("Wow that's awesome!"));
		

		Post post02 = new Post(LocalDateTime.parse("2018-07-28T23:14:19"), "Good night guys", "See you tomorrow", 5);
		
		post02.addComments(new Comment("Good night"));
		post02.addComments(new Comment("May the Force be with you"));
		
		System.out.println(post01);
		
		System.out.println();
		
		System.out.println(post02);
	}

}
