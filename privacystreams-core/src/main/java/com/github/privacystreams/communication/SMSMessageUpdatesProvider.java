package com.github.privacystreams.communication;

import android.Manifest;

import com.github.privacystreams.core.providers.MultiItemStreamProvider;

/**
 * Created by yuanchun on 21/11/2016.
 * provide a stream of Message messages
 */

class SMSMessageUpdatesProvider extends MultiItemStreamProvider {

    SMSMessageUpdatesProvider() {
        this.addRequiredPermissions(Manifest.permission.READ_SMS);
    }

    @Override
    protected void provide() {
        // TODO implement this
    }
}
