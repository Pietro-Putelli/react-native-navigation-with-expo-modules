
/* ADDED WITH NPX RNN-LINK */

// package com.myapp;

// import com.reactnativenavigation.NavigationActivity;

// public class MainActivity extends NavigationActivity {

  
// }

/* EXPO MODULES MANUAL INSTALLATION */

package com.myapp;
import expo.modules.ReactActivityDelegateWrapper;
import com.facebook.react.ReactActivityDelegate;
 
import com.facebook.react.ReactActivity;
 
  protected String getMainComponentName() {
    return "Example";
  }
 
  @Override
  protected ReactActivityDelegate createReactActivityDelegate() {
    return new ReactActivityDelegateWrapper(this,
      new ReactActivityDelegate(this, getMainComponentName())
    );
  }
}