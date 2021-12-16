package makestreamputvideo.makestreamputvideo.makestreamputvideoingoogledriveandputlinkinfirebase;

import android.app.Notification;
import android.media.session.MediaSession;

public class Sender {

    public String to;
    public Notification notification;

    public Sender(String to, Notification notification) {
        this.to = to;
        this.notification = notification;
    }

    public Sender(MediaSession.Token token) {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
