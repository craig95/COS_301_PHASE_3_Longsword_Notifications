import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import com.sun.nio.sctp.NotificationHandler;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

public class TestJunit{
    @Test

    public void testSingleEmail(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "this is to fest if this email sent.";
        //for(int i =0; i<1000; i++){
            String message = greeting + ' ' + username + ' ' + body;
            Notifications notify = new Notifications();
            String success = notify.SendTargetedEmail("gladius.notification@gmail.com", "Longsword Notification", "Longsword notification Test");
            try {
                assertEquals("true", success.substring(12, 16));
                if ("true".compareTo(success.substring(12, 16)) == 0) {
                    assertTrue("Successfully sent single email.", true);
                } else {
                    fail("Failed to send single email.");
                }
            } catch (Exception e) {
                fail("Failed to send single email.");
            }
       // }
    }

    @Test
    public void testSingleEmailBatch(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "this is to fest if this email sent.";
        for(int i =0; i<100; i++){
        String message = greeting + ' ' + username + ' ' + body;
        Notifications notify = new Notifications();
        String success = notify.SendTargetedEmail("gladius.notification@gmail.com", "Longsword Notification", "Longsword notification Test");
        try {
            assertEquals("true", success.substring(12, 16));
            if ("true".compareTo(success.substring(12, 16)) == 0) {
                assertTrue("Successfully sent single email.", true);
            } else {
                fail("Failed to send single email.");
            }
        } catch (Exception e) {
            fail("Failed to send single email.");
        }
        }
    }


    @Test
    public void testSingleInvalidEmail(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "this is to fest if this email sent.";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendTargetedEmail("u15029779@", "Longsword Notification","Longsword notification Test");
        try {
            assertEquals("false", success.substring(12,16));
            if ("false" == success.substring(12,16)) {
                assertTrue("Successfully sent incorrect email address email.", true);
            } else {
                fail("Failed to sent incorrect email address email.");
            }
        } catch (Exception e) {
            fail("Failed to sent incorrect email address email.");
        }
    }

    @Test
    public void testSingleIEmptyEmail(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "this is to fest if this email sent.";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendTargetedEmail("u15029779@tuks.co.za", "Longsword Notification","");
        try {
            assertEquals("false", success.substring(12,16));
            if ("false" == success.substring(12,16)) {
                assertTrue("Successfully sent empty email.", true);
            } else {
                fail("Failed to send empty email.");
            }
        } catch (Exception e) {
            fail("Failed to send empty  email.");
        }
    }

    @Test
    public void testEmailAllSentPass(){
        String message = "Testing Email to All";
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("true", success.substring(12,16));
            if ("false" == success.substring(12,16)) {
                assertTrue("Successfully sent multiple emails.", true);
            } else {
                fail("Failed to send multiple emails.");
            }
        } catch (Exception e) {
            fail("Failed to send multiple emails.");
        }
    }

    @Test
    public void testEmailAllSentFail(){
        String message = "Testing Email to All";
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("false" == success.substring(12,16)) {
                assertTrue("Successfully sent multiple emails.", true);
            } else {
                fail("Failed to send multiple emails.");
            }
        } catch (Exception e) {
            fail("Failed to send multiple emails.");
        }
    }

    @Test
    public void testEmptyEmailAllSentFail(){
        String message = "";
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("false" == success.substring(12,16)) {
                assertTrue("Successfully sent multiple emails.", true);
            } else {
                fail("Failed to send multiple emails.");
            }
        } catch (Exception e) {
            fail("Failed to send multiple emails.");
        }
    }

    @Test
    public void testEmailTargettedSentSuccessful(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "This email is a test to see if you are awesome";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("true", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted email.", true);
            } else {
                fail("Failed to send targeted email");
            }
        } catch (Exception e) {
            fail("Failed to send targeted email");
        }
    }

    @Test
    public void testNoAddressEmailTargettedSentSuccessful(){
        String greeting = "Good Day";
        String username = "";
        String body = "This email is a test to see if you are awesome";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted email.", true);
            } else {
                fail("Failed to send targeted email");
            }
        } catch (Exception e) {
            fail("Failed to send targeted email");
        }
    }

    @Test
    public void testNoBodyEmailTargettedSentSuccessful(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body ="";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted email.", true);
            } else {
                fail("Failed to send targeted email");
            }
        } catch (Exception e) {
            fail("Failed to send targeted email");
        }
    }

    @Test
    public void testEmailTargetedSentFail(){
        String message = null;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted email.", true);
            } else {
                fail("Failed to send targeted email");
            }
        } catch (Exception e) {
            fail("Failed to send targeted email");
        }
    }

    public void testSmsAllSentSuccessful(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "This email is a test to see if you are awesome";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("true", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted SMS to all.", true);
            } else {
                fail("Failed to send targeted SMS to all.");
            }
        } catch (Exception e) {
            fail("Failed to send targeted SMS to all.");
        }
    }

    public void testEmptySmsAllSentFail(){
        String greeting = "";
        String username = "";
        String body = "";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("fail", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted SMS to all.", true);
            } else {
                fail("Failed to send targeted SMS to all");
            }
        } catch (Exception e) {
            fail("Failed to send targeted SMS to all");
        }
    }

    public void testSmsTargettedSentSuccessful(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "This email is a test to see if you are awesome";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("true", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted SMS.", true);
            } else {
                fail("Failed to send targeted SMS");
            }
        } catch (Exception e) {
            fail("Failed to send targeted SMS");
        }
    }

    public void testEmptySmsTargettedSentSuccessful(){
        String greeting ="";
        String username ="";
        String body="";

        String message = greeting + ' ' + username + ' ' +body;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted SMS.", true);
            } else {
                fail("Failed to send targeted SMS");
            }
        } catch (Exception e) {
            fail("Failed to send targeted SMS");
        }
    }

    public void testSmsTargetedSentFail(){
        String message = null;
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("fail", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent targeted SMS.", true);
            } else {
                fail("Failed to send targeted SMS");
            }
        } catch (Exception e) {
            fail("Failed to send targeted SMS");
        }
    }
}
