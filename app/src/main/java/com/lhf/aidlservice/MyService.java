package com.lhf.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    class MyBinder extends IMyAidlInterface.Stub{

        @Override
        public String getData() throws RemoteException {
            return "This is a String data from service!";
        }

        @Override
        public User getUser() throws RemoteException {
            return new User("Joshua");
        }


    }
}
