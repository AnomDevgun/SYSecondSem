#!/bin/sh
zenity --entry --title="ADDITION" --text="Name:" >temp.txt;
name=$(cat temp.txt)
zenity --entry --title="ADDITION" --text="City:" >temp.txt;
city=$(cat temp.txt)
zenity --entry --title="ADDITION" --text="State" >temp.txt;
state=$(cat temp.txt)
echo " $name  $city  $state " >> address.txt
 zenity --info --title="DONE" --text="DATA ADDED SUCCESSFULLY"
exit 0
