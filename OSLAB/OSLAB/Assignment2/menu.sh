#!/bin/sh
notify-send " ADDRESS BOOK OPENED "
while [ true ]; do
./menu1.sh>temp.txt;
choice=$(cat temp.txt)
echo $choice
if [ $choice = 'ADD' ] 
then
notify-send " ADDITION STARTED "
./add.sh
sleep 1s
clear
elif [ $choice = 'LIST' ]
then
notify-send " DISPLAY RECORD STARTED "
./list.sh
sleep 2s
elif [ $choice = 'FIND' ]
then
notify-send " FINDING PROCESS  STARTED "
./find.sh
sleep 2s
elif [ $choice = 'DELETE' ]
then
notify-send " DELETION STARTED "
./delete.sh
sleep 1s
clear
elif [ $choice = 'UPDATE' ]
then
notify-send " UPDATION PROCESS  STARTED "
./update.sh
sleep 1s
clear
elif [ $choice = 'EXIT' ]
then
notify-send " Goodbye.  "
exit 0
fi
done

