#!/bin/sh
zenity --entry --title=" SEARCH" --text="Enter Name Of Record Holder: " >temp.txt;
fin=$(cat temp.txt)
grep "$fin" address.txt > temp.txt
f=$(cat temp.txt)
if [ $f = '']
then
zenity --info --title=" 404Lol " --text=" Record not Found. " 
else
zenity --list --title=" FOUND " --column "Name" --column "City" --column " State " $f --height=300 --width=350
fi
exit 0
