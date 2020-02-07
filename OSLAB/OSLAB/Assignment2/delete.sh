#!/bin/sh
zenity --entry --title="Delete Record" --text="Enter Name of Record Holder:" >temp.txt;
t=$(cat temp.txt)
grep -vE $t address.txt > temp.txt
cp temp.txt address.txt
zenity --info --title="Done!" --text="Deleted Successfully"
exit 0
