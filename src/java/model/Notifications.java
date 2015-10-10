
package model;

import java.util.Date;
import modelBO.NotificationsBO;


public class Notifications {
    
    private int idnotifications;
    private String usernameA;
    private String usernameB;
    private String notification_type;
    private String message;
    private Date date_created;
    private int referred_id;
    private String isReadA;
    private String isReadB;
    
    public Notifications(){
        
    }
    
    public NotificationsBO toNotificationsBO(){
        NotificationsBO notificationsBO= new NotificationsBO();
        notificationsBO.setIdnotifications(idnotifications);
        notificationsBO.setUsernameA(usernameA);
        notificationsBO.setUsernameB(usernameB);
        notificationsBO.setNotification_type(notification_type);
        notificationsBO.setMessage(message);
        notificationsBO.setDate_created(date_created);
        notificationsBO.setReferred_id(referred_id);
        notificationsBO.setIsReadA(isReadA);
        notificationsBO.setIsReadB(isReadB);
               
        return notificationsBO;
    }
    
    

    /**
     * @return the idnotifications
     */
    public int getIdnotifications() {
        return idnotifications;
    }

    /**
     * @param idnotifications the idnotifications to set
     */
    public void setIdnotifications(int idnotifications) {
        this.idnotifications = idnotifications;
    }

    /**
     * @return the usernameA
     */
    public String getUsernameA() {
        return usernameA;
    }

    /**
     * @param usernameA the usernameA to set
     */
    public void setUsernameA(String usernameA) {
        this.usernameA = usernameA;
    }

    /**
     * @return the usernameB
     */
    public String getUsernameB() {
        return usernameB;
    }

    /**
     * @param usernameB the usernameB to set
     */
    public void setUsernameB(String usernameB) {
        this.usernameB = usernameB;
    }

    /**
     * @return the notification_type
     */
    public String getNotification_type() {
        return notification_type;
    }

    /**
     * @param notification_type the notification_type to set
     */
    public void setNotification_type(String notification_type) {
        this.notification_type = notification_type;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the date_created
     */
    public Date getDate_created() {
        return date_created;
    }

    /**
     * @param date_created the date_created to set
     */
    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    /**
     * @return the referred_id
     */
    public int getReferred_id() {
        return referred_id;
    }

    /**
     * @param referred_id the referred_id to set
     */
    public void setReferred_id(int referred_id) {
        this.referred_id = referred_id;
    }

    /**
     * @return the isReadA
     */
    public String getIsReadA() {
        return isReadA;
    }

    /**
     * @param isReadA the isReadA to set
     */
    public void setIsReadA(String isReadA) {
        this.isReadA = isReadA;
    }

    /**
     * @return the isReadB
     */
    public String getIsReadB() {
        return isReadB;
    }

    /**
     * @param isReadB the isReadB to set
     */
    public void setIsReadB(String isReadB) {
        this.isReadB = isReadB;
    }
    
    
    
    
}
