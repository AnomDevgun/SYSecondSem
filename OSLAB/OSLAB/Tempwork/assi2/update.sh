#!/bin/sh
zenity --entry --title="UPDATION " --text="ENTER THE NAME OR ROLL_NO YOU WANT TO REPLACE" >temp.txt;
abc=$(cat temp.txt)
zenity --entry --title="ADDITION" --text=" ENTER REPLACEMENT DATA" >temp.txt;
xyz=$(cat temp.txt)
sed -i -e "s/$abc/$xyz/g" address.txt
zenity --info --title="DONE" --text="DATA UPDATION SUCESSFULL"
exit 0
