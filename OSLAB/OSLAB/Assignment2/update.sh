#!/bin/sh
zenity --entry --title="UPDATION " --text="Enter Name of Record Holder" >temp.txt;
abc=$(cat temp.txt)
zenity --entry --title="ADDITION" --text=" Enter New Name" >temp.txt;
xyz=$(cat temp.txt)
sed -i -e "s/$abc/$xyz/g" address.txt
zenity --info --title="DONE" --text="Data Updated Successfully."
exit 0
