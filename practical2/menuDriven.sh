echo "1. List of Files"
echo "2. Calender"
echo "3. Date"
echo "4. Users in Program"
echo "5. Quit"
while :
do
	read choice
	case $choice in
		1) ls;;
		2) cal;;
		3) date;;
		4) uname -a;;
		5) exit;;
		*) echo "Invalid Choice";;
	esac
done