package com.github.privacystreams.communication;

import com.github.privacystreams.core.MultiItemStream;
import com.github.privacystreams.core.providers.MultiItemStreamProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanchun on 21/11/2016.
 * provide a stream of Message messages
 */

class SMSMessageUpdatesProvider extends MultiItemStreamProvider {

    SMSMessageUpdatesProvider() {
    }

    @Override
    protected void provide(MultiItemStream output) {
        // TODO implement this
    }

    @Override
    protected List<Object> getParameters() {
        List<Object> parameters = new ArrayList<>();
        return parameters;
    }
}