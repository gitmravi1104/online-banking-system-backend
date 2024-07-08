package com.onlinebankingsystem.dto;

import com.onlinebankingsystem.entity.User;

import lombok.Data;

@Data
public class UserLoginResponse extends CommonApiResponse {

	private User user;
	
	private String jwtToken;

	public void setUser(User user2) {
		// TODO Auto-generated method stub
		
	}

	public void setJwtToken(String jwtToken2) {
		// TODO Auto-generated method stub
		
	}

}
