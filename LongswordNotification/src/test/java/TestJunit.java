import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;


public class TestJunit{

    @Test
    public void testSingleEmail(){
        String message = "Longsword Notification test.";
        Notifications notify = new Notifications();
        String success = notify.SendTargetedEmail("u15029779@tuks.co.za", "Longsword Notification", message);
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

    @Test
    public void testSingleEmailInvalidAddress(){
        String message = "Longsword Notification test.";
        Notifications notify = new Notifications();
        String success = notify.SendTargetedEmail("u15029779@", "Longsword Notification", message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("false" == success.substring(12,16)) {
                assertTrue("Invalid email address, email was not send.", true);
            } else {
                fail("Invalid email was somehow successfully sent");
            }
        } catch (Exception e) {
            fail("Invalid email was somehow successfully sent");
        }
    }

    @Test
    public void testSingleEmailIEmptyBody(){
        String message = "";
        Notifications notify = new Notifications();
        String success = notify.SendTargetedEmail("u15029779@tuks.co.za", "Longsword Notification", message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("false" == success.substring(12,16)) {
                assertTrue("Empty body validation succeeded. Email was not sent.", true);
            } else {
                fail("Empty body validation failed. Email was sent.");
            }
        } catch (Exception e) {
            fail("Empty body validation failed. Email was sent.");
        }
    }

    @Test
    public void testEmailAll(){
        String message = "Testing Email to All";
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("true", success.substring(12,16));
            if ("true" == success.substring(12,16)) {
                assertTrue("Successfully sent multiple emails.", true);
            } else {
                fail("Failed to send multiple emails.");
            }
        } catch (Exception e) {
            fail("Failed to send multiple emails.");
        }
    }

    @Test
    public void testEmailAllEmptyBody(){
        String message = "";
        Notifications notify = new Notifications();
        String success = notify.SendEmailToAll(message);
        try {
            assertEquals("false", success.substring(12,16));
            if ("false" == success.substring(12,16)) {
                assertTrue("Empty body validation succeeded. Email was not sent.", true);
            } else {
                fail("Empty body validation failed. Email was sent.");
            }
        } catch (Exception e) {
            fail("Empty body validation failed. Email was sent.");
        }
    }

    @Test
    public void testSingleSMS(){
        String message = "SMS Test";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(true, success);
            if (true == success) {
                assertTrue("Successfully sent single SMS.", true);
            } else {
                fail("Failed to send single SMS");
            }
        } catch (Exception e) {
            fail("Failed to send single SMS");
        }
    }

    @Test
    public void testSingleSMSInvalidUser(){
        String message = "SMS Test";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(false, success);
            if (false == success) {
                assertTrue("Invalid user, SMS was not send.", true);
            } else {
                fail("SMS was somehow successfully sent to a invalid user.");
            }
        } catch (Exception e) {
            fail("SMS was somehow successfully sent to a invalid user.");
        }
    }

    @Test
    public void testSingleSMSEmptyMessage(){
        String message = "";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(false, success);
            if (false == success) {
                assertTrue("Empty message validation succeeded. SMS was not sent.", true);
            } else {
                fail("Empty message validation failed. SMS was sent.");
            }
        } catch (Exception e) {
            fail("Empty message validation failed. SMS was sent.");
        }
    }

    @Test
    public void testSMSAll(){
        String message = "Testing SMS to all";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(true, success);
            if (true == success) {
                assertTrue("Successfully sent multiple SMS messages.", true);
            } else {
                fail("Failed to send multiple SMS messages.");
            }
        } catch (Exception e) {
            fail("Failed to send multiple SMS messages.");
        }
    }


    @Test
    public void testSMSAllEmptyMessage(){
        String message = "";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(false, success);
            if (false == success) {
                assertTrue("Empty message validation succeeded. SMS messages were not sent.", true);
            } else {
                fail("Empty message validation failed. SMS messages were sent.");
            }
        } catch (Exception e) {
            fail("Empty message validation failed. SMS messages were sent.");
        }
    }

    @Test
    public void testSinglePushNotification(){
        String message = "Push Test";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(true, success);
            if (true == success) {
                assertTrue("Successfully sent single Push Notification.", true);
            } else {
                fail("Failed to send single Push Notification");
            }
        } catch (Exception e) {
            fail("Failed to send single Push Notification");
        }
    }

    @Test
    public void testSinglePushNotificationInvalidUser(){
        String message = "Push Test";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(false, success);
            if (false == success) {
                assertTrue("Invalid user, Push Notification was not send.", true);
            } else {
                fail("Push Notification was somehow successfully sent to a invalid user.");
            }
        } catch (Exception e) {
            fail("Push Notification was somehow successfully sent to a invalid user.");
        }
    }

    @Test
    public void testSinglePushNotificationEmptyMessage(){
        String message = "";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(false, success);
            if (false == success) {
                assertTrue("Empty message validation succeeded. Push Notification was not sent.", true);
            } else {
                fail("Empty message validation failed. Push Notification was sent.");
            }
        } catch (Exception e) {
            fail("Empty message validation failed. Push Notification was sent.");
        }
    }

    @Test
    public void testPushNotificationAll(){
        String message = "Testing Push to all";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(true, success);
            if (true == success) {
                assertTrue("Successfully sent multiple Push Notifications.", true);
            } else {
                fail("Failed to send multiple Push Notification.");
            }
        } catch (Exception e) {
            fail("Failed to send multiple Push Notification.");
        }
    }


    @Test
    public void testPushNotificationAllEmptyMessage(){
        String message = "";
        Notifications notify = new Notifications();
        boolean success = notify.SendTargetedSms(null, message);
        try {
            assertEquals(false, success);
            if (false == success) {
                assertTrue("Empty message validation succeeded. Push Notifications were not sent.", true);
            } else {
                fail("Empty message validation failed. Push Notifications were sent.");
            }
        } catch (Exception e) {
            fail("Empty message validation failed. Push Notifications were sent.");
        }
    }

    @Test
    public void testEmailBatch100(){
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
                    assertTrue("Successfully sent batch emails.", true);
                } else {
                    fail("Failed to send batch emails.");
                }
            } catch (Exception e) {
                fail("Failed to send batch emails.");
            }
        }
    }

    @Test
    public void testEmailBatch50(){
        String greeting = "Good Day";
        String username = "John Wick";
        String body = "this is to fest if this email sent.";
        for(int i =0; i<50; i++){
            String message = greeting + ' ' + username + ' ' + body;
            Notifications notify = new Notifications();
            String success = notify.SendTargetedEmail("gladius.notification@gmail.com", "Longsword Notification", "Longsword notification Test");
            try {
                assertEquals("true", success.substring(12, 16));
                if ("true".compareTo(success.substring(12, 16)) == 0) {
                    assertTrue("Successfully sent batch emails.", true);
                } else {
                    fail("Failed to send batch emails.");
                }
            } catch (Exception e) {
                fail("Failed to send batch emails.");
            }
        }
    }
}
