#! /bin/bash

while :
    do
       read -p 'Enter a number: ' num
      case $num in
        1) echo "It's Monday";;
        2) echo "It's Tuesday";;
        3) echo "It's Wednesday";;
        4) echo "It's Thursday";;
        5) echo "It's Friday";;
        6) echo "It's Saturday";;
        7) echo "It's Sunday";;
        *) echo "Invalid choice";;
      esac
done
