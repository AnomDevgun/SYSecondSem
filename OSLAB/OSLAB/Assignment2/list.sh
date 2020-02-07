#!/bin/sh
a=$(cat address.txt)
zenity --list --title="RECORD DISPLAY" --column "Name" --column "City" --column " State "$a --height=300 --width=350
exit 0

