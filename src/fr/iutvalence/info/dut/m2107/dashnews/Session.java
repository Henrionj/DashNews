package fr.iutvalence.info.dut.m2107.dashnews;

/**
 * Class Session.
 * @author  IT Prouds & CO.
 *
 */
public class Session {

	/**
	 * Privileges for the current session.
	 */
	private Privileges privileges;
	
	/**
	 * Login for the current session.
	 */
	private String login;
	/**
	 * Password for the current session.
	 */
	private String password;
	
	/**
	 * Initializes a session with a login and a password.
	 * @param login Login of the user.
	 * @param password Password of the user.
	 */
	public Session(String login, String password)
	{
		this.login = login;
		this.password = password;
		this.privileges = Privileges.DEFAULT_USER;
	}
	
	/**
	 * Authentificates for the current session.
	 */
	public void authentification() {

	}

	/**
	 * Gets the privileges of a user.
	 * @return
	 */
	public Privileges getPrivileges() {
		// TODO Auto-generated method stub
		return this.privileges;
	}

}