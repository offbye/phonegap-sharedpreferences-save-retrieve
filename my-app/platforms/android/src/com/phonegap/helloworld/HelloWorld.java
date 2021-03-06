/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.phonegap.helloworld;

import android.os.Bundle;
import org.apache.cordova.*;
import android.telephony.TelephonyManager;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class HelloWorld extends CordovaActivity 
{
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        super.init();
        
        //appView.addJavascriptInterface(this, "HelloWorld");
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html");
    }
    /*
    @JavascriptInterface
    public String get_imei() {
        TelephonyManager telephonyManager = (TelephonyManager)this.getSystemService(Context.TELEPHONY_SERVICE);
        String imei = telephonyManager.getDeviceId();
        Toast.makeText(this, "[JAVA] The IMEI is:"+imei, Toast.LENGTH_LONG).show();
        return imei;    
    }
    */
}

