# 🧮 Profile App

This is a simple **Profile Demo** app. This app is build with two activities where we can input our name and a short text as our Biography. Then both text will display in a new activity this allowed me to learn Android Activities lifecycle.

## 🚀 Features

- Java-based structure
- Two simple activities with state persistence
- EditText input and data transfer between activities
- Open a browser via an ImageView that links to my LinkedIn profile
- Handle intents in the AndroidManifest to support URL navigation
- Check for available browser apps using getPackageManager()
- Log app events using LogCat for debugging

## 🛠️ Built With

- **Android Studio**
- **Java**
- **XML Layouts**

## 📁 Project Structure
```
app/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── pt/pedrorocha/android/clickcounter/
│ │ │ └── HomeActivity.java
│ │ │ └── ProfileActivity.java
│ │ ├── res/
│ │ │ ├── layout/
│ │ │ │ └── activity_main.xml
│ │ │ └── values/
│ │ │ └── strings.xml
│ │ └── AndroidManifest.xml
```

## 🧠 Learning Goals

- Navigation between two Activities
- Work with buttons, `TextView`, `EditText`, `ImageViews` and `onClickListeners`
- Using resources and string values manipulations
- Learn how to update UI elements programmatically
- State Preservation and the usage of onSaveInstanceState() to save important data before the activity is destroyed
- Use onCreate() or onRestoreInstanceState() for restoring saved UI state
- Toast feedback message to debug purposes and activity lifecycle tracking and learning.

## 📱 Screenshots


## 🔧 How to Run

1. Clone the repository:
   ```bash
   git clone git@github.com:PedroRocha84/android-java-profile.git

2. Open the project in Android Studio
3. Launch an emulator or connect a device
4. Click Run (Shift + F10)
