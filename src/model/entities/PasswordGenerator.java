package model.entities;

public class PasswordGenerator {
	private static String passwordResult;
	
	public static void generateRandomPassword(Integer passLength) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&*()";
		char[] password = new char[passLength];

		for (int j = 0; j < passLength; j++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[j] = passwordSet.charAt(rand);
		}
		passwordResult = String.valueOf(password);
	}
	
	public String getPasswordResult() {
		return passwordResult;
	}
	
}
