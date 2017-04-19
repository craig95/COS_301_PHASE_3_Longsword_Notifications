/**
 * Created by Kyle on 4/19/2017.
 */

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class pushNotificationServer
{
    pushNotificationServer()
    {
    }

    public void sendNotification(String notification, User users[])
    {
        try
        {
            // send your parameters to your site
            for (int j = 0; j < users.length; j++)
            {
                // open a connection to the site
                URL url = new URL("http://www.unhinged.co.za/Demo/COS301/pushNotificationServer.php");
                URLConnection con = url.openConnection();

                // activate the output
                con.setDoOutput(true);
                PrintStream ps = new PrintStream(con.getOutputStream());

                // Add the filename to the request
                ps.print("&filename=notification" + users[j].getID() + ".txt");

                // Add the notification to the request
                ps.print("&notification=" + notification + "#END#");

                // Add the user IDs to the request
                //ps.print("&user" + j + "=" + users[j].getID());

                // we have to get the input stream in order to actually send the request
                con.getInputStream();

                // close the print stream
                ps.close();
            }


        } catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public void sendNotification(String notification, User user)
    {
        try
        {
            // send your parameters to your site
            // open a connection to the site

            URL url = new URL("http://www.unhinged.co.za/Demo/COS301/pushNotificationServer.php");
            URLConnection con = url.openConnection();

            // activate the output
            con.setDoOutput(true);
            PrintStream ps = new PrintStream(con.getOutputStream());

            // Add the filename to the request
            ps.print("&filename=notification" + user.getID() + ".txt");

            // Add the notification to the request
            ps.print("&notification=" + notification + "#END#");

            // Add the user IDs to the request
            //ps.print("&user" + j + "=" + users[j].getID());

            // we have to get the input stream in order to actually send the request
            con.getInputStream();

            // close the print stream
            ps.close();

        } catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public boolean isThereNotification(User user)
    {
        try
        {
            URL url = new URL("http://www.unhinged.co.za/Demo/COS301/notification" + user.getID() + ".txt");
            Scanner scanner = new Scanner(url.openStream());

            if (scanner.next() == "")
            {
                return false;
            } else
            {
                return true;
            }

        } catch (Exception e)
        {
            System.out.println(e);
        }

        return false;
    }

    public void printNotifications(User user)
    {
        try
        {
            URL url = new URL("http://www.unhinged.co.za/Demo/COS301/notification" + user.getID() + ".txt");
            URLConnection con = url.openConnection();
            con.setUseCaches(false);
            Scanner scanner = new Scanner(url.openStream()).useDelimiter("#END#");

            while (scanner.hasNext())
            {
                System.out.println(scanner.next());
            }

        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public String[] getNotifications(User user)
    {
        try
        {
            ArrayList<String> list = new ArrayList<>();

            URL url = new URL("http://www.unhinged.co.za/Demo/COS301/notification" + user.getID() + ".txt");
            URLConnection con = url.openConnection();
            con.setUseCaches(false);
            Scanner scanner = new Scanner(url.openStream()).useDelimiter("#END#");

            while (scanner.hasNext())
            {
                list.add(scanner.next());
            }

            String notifications[] = new String[list.size()];

            for (int j = 0; j < notifications.length; j++)
            {
                notifications[j] = list.get(j);
            }

            return notifications;

        } catch (Exception e)
        {
            System.out.println(e);
        }

        return null;
    }

    public void deleteNotifications(User users[])
    {
        try
        {
            // send your parameters to your site
            for (int j = 0; j < users.length; j++)
            {
                // open a connection to the site
                URL url = new URL("http://www.unhinged.co.za/Demo/COS301/pushNotificationServer.php");
                URLConnection con = url.openConnection();

                // activate the output
                con.setDoOutput(true);
                PrintStream ps = new PrintStream(con.getOutputStream());

                // Add the filename to the request
                ps.print("&filename=notification" + users[j].getID() + ".txt");

                // Add the notification to the request
                ps.print("&deleteFile=true");

                // Add the user IDs to the request
                //ps.print("&user" + j + "=" + users[j].getID());

                // we have to get the input stream in order to actually send the request
                con.getInputStream();

                // close the print stream
                ps.close();
            }


        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void deleteNotification(User user)
    {
        try
        {
            // send your parameters to your site
            // open a connection to the site
            URL url = new URL("http://www.unhinged.co.za/Demo/COS301/pushNotificationServer.php");
            URLConnection con = url.openConnection();

            // activate the output
            con.setDoOutput(true);
            PrintStream ps = new PrintStream(con.getOutputStream());

            // Add the filename to the request
            ps.print("&filename=notification" + user.getID() + ".txt");

            // Add the notification to the request
            ps.print("&deleteFile=true");

            // Add the user IDs to the request
            //ps.print("&user" + j + "=" + users[j].getID());

            // we have to get the input stream in order to actually send the request
            con.getInputStream();

            // close the print stream
            ps.close();


        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
