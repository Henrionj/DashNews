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

	public Privileges getPrivileges() {
		// TODO Auto-generated method stub
		return this.privileges;
	}

}