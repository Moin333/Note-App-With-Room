# 📝 Note App with Room
A simple Note-taking application built using Android Jetpack Compose and Room Database. The app demonstrates CRUD (Create, Read, Update, Delete) operations with a clean and modern UI.

## ✨ Features
- 🗒️ Create, read, update, and delete notes.
- 🔍 Search notes by title.
- 🌑 Dark mode and 🌞 Light mode support.
- 🚀 Built using Jetpack Compose for modern UI development.
- 📂 Room Database for local storage.

## 🛠️ Tech Stack
- Language: Kotlin
- UI: Jetpack Compose
- Database: Room
- Architecture: MVVM (Model-View-ViewModel)
- Dependency Injection: ViewModelProvider

## 🚀 How to Run
1. Clone this repository:
git clone https://github.com/your-username/NoteAppWithRoom.git
cd NoteAppWithRoom
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## 📸 Screenshots

### 🌙 Dark Mode
<p align="center"> <img src="./Screenshot 0 Dark.png" alt="Dark Mode Screenshot 1" width="180" /> <img src="./Screenshot 1 Dark.png" alt="Dark Mode Screenshot 2" width="180" /> </p>

### ☀️ Light Mode
<p align="center"> <img src="./Screenshot 0 Light.png" alt="Light Mode Screenshot 1" width="180" /> <img src="./Screenshot 1 Light.png" alt="Light Mode Screenshot 2" width="180" /> </p>

## 🗂️ Project Structure

├── data
│   ├── Note.kt                # Data class for Note entity
│   ├── NoteDao.kt             # DAO interface for database operations
│   └── NoteDatabase.kt        # Room Database instance
├── ui
│   ├── MainActivity.kt        # Entry point of the app
│   ├── NoteViewModel.kt       # ViewModel for note operations
│   └── NotesApp.kt         # Jetpack Compose UI components
└── NoteViewModelFactory.kt    # Factory to provide ViewModel with DAO dependency

## 🏗️ Architecture
This project follows the MVVM pattern:
1. Model: Represents the data and handles business logic (Room Database).
2. View: The user interface built using Jetpack Compose.
3. ViewModel: Acts as a bridge between the Model and View, managing UI-related data and logic.

## 📄 License
This project is licensed under the MIT License. See the LICENSE file for more details.

## 🙌 Acknowledgments
Google for Jetpack Compose and Room.
Android Community for valuable tutorials and examples.
