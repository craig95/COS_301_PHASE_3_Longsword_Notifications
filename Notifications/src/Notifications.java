import java.util.List;

public class Notifications
{
    public class User
    {

    }
    /**
     * param String notification - The notification we wish to push 
     */
	public void PushNotificationToAll (String notification)
	{
	}

	/**
     * param String notification - The notification we wish to push 
     * param List<User> users - The users we want to send the notification to 
     */
	public void PushTargetedNotification (List<User> users, String notification)
	{
	}

	/**
     * param String notification - The notification we wish to send via email
     */
	public void SendEmailToAll(String html)
	{
	}

		/**
     * param String notification - The notification we wish to send via email
     * param List<User> users - The users we want to send the notification to 
     */
	public void SendTargetedEmail(List<User> users, String notification)
	{
	}

	/**
     * param String notification - The notification we wish to send via sms
     */
	public void SendSmsToAll (String notification)
	{

        // For the SMS feature we decided www.twilio.com offers a simple API. This would allow us to sms our users.

        //To use the api we would need to import
        /*
        * import com.twilio.Twilio;
        * import com.twilio.rest.api.v2010.account.Message;
        * import com.twilio.type.PhoneNumber;
        * */

        //The code below is an example of the system
        /*
        * String accountSid = "ACXXXXXX"; // Your Account SID from www.twilio.com/user/account
        * String authToken = "XXXXXXXX"; // Your Auth Token from www.twilio.com/user/account
        * Twilio.init(accountSid, authToken);
        *
        * Message message = Message.creator(
        *   new PhoneNumber("+15558881234"),  // To number
        *   new PhoneNumber("+15559994321"),  // From number
        *   "Hello world!"                    // SMS body
        * ).create();
        * System.out.println(message.getSid())
        * */

        // An example of how we would implement this in our system
        /*
        * List<User> users = Data.getAllUsers();
        *
        * for (int j = 0; j < Users.size(); j++)
        * {
        *   Message message = Message.creator(
        *       new PhoneNumber(users.get(j).getCellPhoneNumber,  // To number
        *       new PhoneNumber("+15559994321"),  // From number
        *       notification                   // SMS body
        *   ).create();
        * }
        *
        * */
	}

	/**
     * param String notification - The notification we wish to send via sms
     * param List<User> users - The users we want to send the notification to 
     */
	public void SendTargetedSms (List<User> users, String notification)
	{
	    // As explained above
        // An example of how we would implement this in our system
        /*
        * for (int j = 0; j < Users.size(); j++)
        * {
        *   Message message = Message.creator(
        *       new PhoneNumber(users.get(j).getCellPhoneNumber,  // To number
        *       new PhoneNumber("+15559994321"),  // From number
        *       notification                   // SMS body
        *   ).create();
        * }
        *
        * */
	}
}
