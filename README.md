# WARISH Cyber Android App
A dark/cyber-style Android app for sharing with followers.

## Build in Termux
Install Java and Gradle:
```bash
pkg update
pkg install openjdk-17 gradle -y
```
From the project folder:
```bash
gradle :app:assembleDebug
```
APK:
`app/build/outputs/apk/debug/app-debug.apk`

Install with:
```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

The app contains Instagram and website buttons and can be customized in `MainActivity.java`.
