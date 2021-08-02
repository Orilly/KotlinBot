# KotlinBot

<a href="https://javacord.org/wiki"><img src="https://shields.javacord.org/badge/Wiki-Home-red.svg?style=flat-square" alt="Javacord Wiki"></a> 
<a href="https://discord.gg/0qJ2jjyneLEgG7y3"><img src="https://shields.javacord.org/discord/151037561152733184.svg?colorB=%237289DA&label=Discord&style=flat-square" alt="Discord Server"></a>

An example bot for the [Javacord](https://github.com/Javacord/Javacord) library - but in Kotlin!

## ☕ Looking for a Java version?

Kotlin > Java. But if you insist... simply head over to [this repository](https://github.com/Javacord/Example-Bot).

*Please note that the Java Example Bot repository is not associated with me, and contains different features to this repository.*

## 🎮 Features 

This bot currently supports the following application ('slash') commands:

* `/ping` Responds with a "Pong!" message. This command is usually used for testing amongst bot developers.
* `/kotlin` Responds with a brief description of the Kotlin language, and a link to its official website. 

*If you want to add more commands, you should check out the [Javacord Wiki](https://javacord.org/wiki/basic-tutorials/interactions/commands.html#creating-a-command).*

## 📰 Env

The bot's token should be stored in a .env file. During testing, this .env should be located inside the project folder. For distribution however, it should be located next to 
the .zip file in a folder, and contain the following information:

```env
# Replace the value with your bot's token.
TOKEN = ODDFOFXUpgf7yEntul5ockCA.OFk6Ph.lmsA54bT0Fux1IpsYvey5XuZk04
```

*If your bot's repository is public, please remember to add the .env to your .gitignore file!*

## 🏗️ Building the bot for distribution

To get a distributable package, you can run the gradle command `gradlew distZip`. A .zip file is then created in at `build/distributions/KotlinBot-1.0.zip`, and contains all the information necessary to run the bot, except for the .env file.

*This is a good alternative to building a [fat jar](https://fatjar.net/).*

## 🏃‍♂️ Running the bot for production

Unzip your bot, and put your .env file in the `bin` folder of the unzipped folder. Simply `cd` into that bin folder, and type `KotlinBot`. Then, the bot will run!

*On Mac/Linux, this is `./KotlinBot`*

## 🎊 Congratulations

Congratulations, you have built & run your first bot with Kotlin / Javacord. You could just stop there, but we both know you want **MORE!** 
You can take this chance to add more features, and once your bot is complete, run your bot on a **VPS** (Virtual Private Server) instead. This way, your bot will be online (hopefully) 99.9% of the time!

> If you have any questions / concerns, you can message me on Discord - my username is Orilly#0001.
