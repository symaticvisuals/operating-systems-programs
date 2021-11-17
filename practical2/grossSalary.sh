echo "Enter the basic Salary: "
read bSalary
gSalary=$((bSalary+((bSalary/100)*40)+(bSalary/100)*20))
echo "Gross Salary : $gSalary"