# TAE


> http://www.automationtestinghub.com/apppackage-and-appactivity-name/


Get the current package with the activity
adb shell
dumpsys window windows | grep -E ‘mCurrentFocus’