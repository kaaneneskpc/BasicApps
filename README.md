# BasicApps

These applications contains basic-intermediate level kotlin programming language knowledge.

# Introduction


Synthetic binding structure was used in the applications here.Synthetic is a tool that frees the findViewById definition to write safe, leaner code.
How do we integrate it into our project?

![Ekran Alıntısı](https://user-images.githubusercontent.com/32849662/102712859-23bd2e00-42d5-11eb-918e-e6afce3e61fd.PNG)

# 1)Storing Data

This app contains Storing Data with Sharedpreferences.Shared preferences allow you to store small amounts of primitive data as key/value pairs in a file on the device. To get a handle to a preference file, and to read, write, and manage preference data, use the SharedPreferences class. The Android framework manages the shared preferences file itself.

# 2)IntentApp 

This app contains intentapp with ActivityLifeCycle.What is the Activity Life Cycle?

![activity_lifecycle](https://user-images.githubusercontent.com/32849662/102713060-63384a00-42d6-11eb-91f4-cc4010c47506.png)

To navigate transitions between stages of the activity lifecycle, the Activity class provides a core set of six callbacks: onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy(). The system invokes each of these callbacks as an activity enters a new state.

onCreate()
You must implement this callback, which fires when the system first creates the activity. On activity creation, the activity enters the Created state. In the onCreate() method, you perform basic application startup logic that should happen only once for the entire life of the activity.

onStart()
When the activity enters the Started state, the system invokes this callback. The onStart() call makes the activity visible to the user, as the app prepares for the activity to enter the foreground and become interactive. For example, this method is where the app initializes the code that maintains the UI.

onResume()
When the activity enters the Resumed state, it comes to the foreground, and then the system invokes the onResume() callback. This is the state in which the app interacts with the user. The app stays in this state until something happens to take focus away from the app. Such an event might be, for instance, receiving a phone call, the user’s navigating to another activity, or the device screen’s turning off.

onPause()
The system calls this method as the first indication that the user is leaving your activity (though it does not always mean the activity is being destroyed); it indicates that the activity is no longer in the foreground (though it may still be visible if the user is in multi-window mode). Use the onPause() method to pause or adjust operations that should not continue (or should continue in moderation) while the Activity is in the Paused state, and that you expect to resume shortly. There are several reasons why an activity may enter this state. 

onStop()
When your activity is no longer visible to the user, it has entered the Stopped state, and the system invokes the onStop() callback. This may occur, for example, when a newly launched activity covers the entire screen. The system may also call onStop() when the activity has finished running, and is about to be terminated.

onDestroy()
onDestroy() is called before the activity is destroyed. The system invokes this callback either because:

the activity is finishing (due to the user completely dismissing the activity or due to finish() being called on the activity), or
the system is temporarily destroying the activity due to a configuration change (such as device rotation or multi-window mode)


# 3)Warning Message

This app contains show warning message to user.
Used structures: Toast,Alert Dialog,Context

# 4)CountDownTimer

This app contains countdown from 10.

# 5)StopWatch

This app contains stopwatch.It was made with Runnables logic.Runnable is an interface that is to be implemented by a class whose instances are intended to be executed by a thread. There are two ways to start a new Thread – Subclass Thread and implement Runnable . There is no need of subclassing Thread when a task can be done by overriding only run() method of Runnable

# ScreenShoots


![WhatsApp Image 2020-12-20 at 3 14 00 PM (1)](https://user-images.githubusercontent.com/32849662/102713211-6b44b980-42d7-11eb-865f-ec701ab586cf.jpeg)
![WhatsApp Image 2020-12-20 at 3 13 59 PM](https://user-images.githubusercontent.com/32849662/102713210-6b44b980-42d7-11eb-959a-26e36f7acb74.jpeg)
![WhatsApp Image 2020-12-20 at 3 13 59 PM (1)](https://user-images.githubusercontent.com/32849662/102713209-6aac2300-42d7-11eb-85cb-94fd51cee8f0.jpeg)
![WhatsApp Image 2020-12-20 at 3 14 00 PM](https://user-images.githubusercontent.com/32849662/102713206-6a138c80-42d7-11eb-8b51-45d442a2f66d.jpeg)
![WhatsApp Image 2020-12-20 at 3 13 59 PM (2)](https://user-images.githubusercontent.com/32849662/102713208-6aac2300-42d7-11eb-866e-5f1791da65cf.jpeg)


