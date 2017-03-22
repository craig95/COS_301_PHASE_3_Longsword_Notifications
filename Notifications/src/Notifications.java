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
	}

	/**
     * param String notification - The notification we wish to send via sms
     * param List<User> users - The users we want to send the notification to 
     */
	public void SendTargetedSms (List<User> users, String notification)
	{
	}
}
