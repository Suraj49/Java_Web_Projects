package com.web_App9.model;

import java.sql.ResultSet;

public interface DAOSarvice {
	public void connectDB();

	public boolean verifyCredentials(String email, String password);

	public void saveRegistration(String name, String city, String email, String mobile);

	public ResultSet listAllRegistrations();

	public void deleteReg(String email);

	public void updateReg(String email, String mobile);

	

}
