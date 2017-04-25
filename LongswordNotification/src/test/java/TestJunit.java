import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit{
    @Test

    public void testEmailAllSentSuccessful(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "This email is a test to see if you are awesome";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendTargetedEmail("u15029779@tuks.co.za", "Longsword Notification","Longsword notification Test");
        assertEquals(success == "true",true);
    }

    public void testEmailAllSentFail(){
        String message = null;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        assertEquals(success == "false",false);
    }

    public void testEmailTargettedSentSuccessful(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "This email is a test to see if you are awesome";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        assertEquals(success == "true",true);
    }

    public void testEmailTargetedSentFail(){
        String message = null;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        assertEquals(success == "false",false);
    }

    public void testSmsAllSentSuccessful(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "This email is a test to see if you are awesome";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        assertEquals(success == "true",true);
    }

    public void testSmsAllSentFail(){
        String message = null;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        assertEquals(success == "true",true);
    }

    public void testSmsTargettedSentSuccessful(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "This email is a test to see if you are awesome";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        assertEquals(success == "true",true);
    }

    public void testSmsTargetedSentFail(){
        String message = null;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        assertEquals(success == "false",true);
    }
}
