package com.yuan.rn.base;

import android.app.Application;

import com.facebook.react.*;
import com.facebook.react.BuildConfig;
import com.facebook.react.shell.MainReactPackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yuan on 2017/1/4.
 * Detail
 */

public class RnApplication extends Application implements ReactApplication{

    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        protected boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage()
            );
        }

    };

        @Override
        public ReactNativeHost getReactNativeHost() {
            return mReactNativeHost;
        }

}
