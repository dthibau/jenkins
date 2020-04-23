package org.formation.members.notification;

import org.springframework.stereotype.Service;

@Service
public class NotificationClientFallback implements NotificationClient {


	    public String sendSimple(Email email) {
	    	System.out.println("sendSimple : FALLING BACK !!!");
	        return "OK";
	    }

}
