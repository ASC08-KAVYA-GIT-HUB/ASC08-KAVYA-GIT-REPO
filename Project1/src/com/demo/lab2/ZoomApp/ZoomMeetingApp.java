package com.demo.lab2.ZoomApp;

public class ZoomMeetingApp extends MeetingRoom {
       private String zoomDeviceId;
      private  String zoomAccountId;

        public void setZoomDeviceId(String zoomDeviceId)
        {
            this.zoomDeviceId = zoomDeviceId;
        }

        public String getZoomDeviceId() {

            return zoomDeviceId;
        }

        public void setZoomAccountId(String zoomAccountId)
        {
            this.zoomAccountId = zoomAccountId;
        }

        public String getZoomAccountId()
        {
            return zoomAccountId;
        }
    }




