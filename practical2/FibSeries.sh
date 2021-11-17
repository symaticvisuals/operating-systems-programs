echo "Enter the number of series: "
read N
a=0

b=1 
   
echo "The Fibonacci series is : "
   
for (( i=0; i<N; i++ ))
do
    echo "$a "
    fibo=$((a + b))
    a=$b
    b=$fibo
done
