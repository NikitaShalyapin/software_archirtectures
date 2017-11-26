package ru.spbstu.icc.kspt.architecture.shalyapin.domain;

/**
 * @author Nikita Shalyapin
 * 
 *         Market administrator. Can manage users and instruments.
 *
 */
public class Administrator extends User {

	/**
	 * Create administrator.
	 * 
	 * @param name
	 *            of the administrator
	 * @param userName
	 *            for login
	 * @param userPassword
	 *            for login
	 */
	public Administrator(String name, String userName, String userPassword) {
		super((long) 0, name, userName, userPassword, User.Access.ADMIN);
	}
}
