public class WelcomeMsg {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println(" [ERROR] No user specified.");

		} else if (args[0].equals("andreas")) {
			User user = new User("Andreas");
			user.welcomeMsg();

		} else if (args[0].equals("jess")) {
			User user = new User("Jess");

		} else {
			System.out.println(" [ERROR] User "+args[0]+" does not exist.");
		}
	}
}