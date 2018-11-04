package tehtävä5;
/* 
 * Oma implementaatio välimuistiin tallennettavasta kirjautuneesta käyttäjästä, joka
 * halutaan pitää singletonina
 */
public class LoggedInUser extends User{

	private static User user = null;

	private LoggedInUser(User user) {
		this.user = user;
	}
	
	public static User getInstance(){
		return user;
	}
	public static User createInstance(User u){
		if (user == null) {
			return new LoggedInUser(u);
		}
		else {return user;}
	}
	public User getUser() {
		return user;
	}
	

}
