package com.github.privacystreams.audio;

import android.Manifest;

import com.github.privacystreams.core.providers.SingleItemStreamProvider;

/**
 * Created by yuanchun on 28/12/2016.
 * record audio with microphone
 */

class AudioRecorder extends SingleItemStreamProvider {
    private final Long duration;

    AudioRecorder(long duration) {
        this.duration = duration;
        this.addParameters(duration);
        this.addRequiredPermissions(Manifest.permission.RECORD_AUDIO);
    }

    @Override
    protected void provide() {
        // TODO implement this
    }
}
