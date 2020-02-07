#!/bin/sh
zenity --entry --title="DELETION" --text="ENTER THE NAME YOU WANT TO DELETE" >temp.txt;
t=$(cat temp.txt)
grep -vE $t address.txt > temp.txt
cp temp.txt address.txt
zenity --info --title="DONE" --text="DELETION SUCESSFUL"
exit 0
