
# Overview


The purpose of this document is to clearly define the software requirements for our team project. 
All features should be listed and the requirements will describe how each feature will function. 
Links to source code and artifacts will also be provided. 

# Software Requirements

<Describe the structure of this section>

## Functional Requirements

### The Player Ship

| ID  | Requirement     | 
| :-------------: | :----------: | 
| FR1.1 | The system shall have a ship controlled by the user with either the mouse or the arrow keys | 
| FR1.2 | The system shall fire lasers from the ship on a specific delay | 
| FR1.3 | The ship shall be exposed and lose its shield after it gets hit five times |
| FR1.4 | The ship shall display an explosion animation when it gets hit after losing its shield |
| FR1.5 | The ship shall have 3 lives, after which is dies completely and the game ends |

### Sound 

| ID  | Requirement     | 
| :-------------: | :----------: | 
| FR2.1 | Menu screen shall play music when games loads up | 
| FR2.2 | Game screen shall play music while on screen |
| FR2.3| Game over screen shall play music while on screen |
| FR2.4 | Laser image shall play laser sound effect when fired by player ship |
| FR2.5 | Explosion sound effect shall play when explosion image appears on screen |

### User Interface

| ID  | Requirement     | 
| :-------------: | :----------: | 
| FR3.1 | There shall be multiple different screens for the main menu, gameplay, and game over| 
| FR3.2 | The users score and lives shall be displayed during the gameplay screen|
| FR3.3| Clicking anywhere on the game over screen shall send the user back to the main menu screen|
| FR3.4 |There shall be two buttons on the main menu screen allowing the user to start or exit game |
| FR3.5 |Reaching 0 lives in the game shall send the user to the game over screen |

## Non-Functional Requirements

### General Game Design

| ID  | Requirement     | 
| :-------------: | :----------: | 
| NFR1.1 | The game shall be developed with the Java graphics library LibGDX | 
| NFR1.2 | The game shall have well defined sprites which perform well with little to no latency |
| NFR1.3| The system shall have a main menu with clear and easy to navigate buttons |
| NFR1.4 | The game shall emulate the look of a retro arcade game |
| NFR1.5 | The game shall not be too hard allowing players of all skill levels to succeed |

### System Specifications

| ID  | Requirement     | 
| :-------------: | :----------: | 
| NFR2.1 | The game shall be able to run on a machine with Java framework installed | 
| NFR2.2 | The game shall be able to be played with any default keyboard layout |
| NFR2.3| The game shall run at a stable framerate, 30-60 fps |
| NFR2.4 | User inputs shall be executed with little to no system latency |
| NFR2.5 | The game window shall scale with a standard 1920 x 1080 monitor resolution  |


# Software Artifacts

<Describe the purpose of this section>

* [Code for the game](https://github.com/MShumaker24/GVSU-CIS350-TeamRetro/tree/master/Game/core/src/teamretro/game)
* [Artifacts link](https://github.com/MShumaker24/GVSU-CIS350-TeamRetro/tree/master/artifacts) 
