#!/bin/bash
#
# Makefile
# 
# Purpose: Compile and test game classes.
# 
# Site: https://dirack.github.io
# 
# Version 1.0
# 
# Programer: Rodolfo A C Neves (Dirack) 30/05/2020
# 
# Email: rodolfo_profissional@hotmail.com
# 
# License: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.

CC = javac
JVM = java
DEP = PongPlayer.class Player.class Enemy.class PlayersFactory.class

all:	$(DEP)

%.class:	%.java
	$(CC) $<

test:
	$(CC) -cp junit-4.13.jar:hamcrest-core-2.2.jar:. TestPlayersFactory.java
	$(JVM) -jar junit-platform-console-standalone-1.6.2.jar -cp . -c TestPlayersFactory
