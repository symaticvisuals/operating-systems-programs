echo "Enter number: "
read N
total=0
for (( i=0; i<N; i++ ))
do
	echo "Enter $i th number"
	read n
	total=$total+$n
done
average=$((total/N))
echo "Average: $average"
